package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class implement {
    static class HashMap<k,v>{

       private class Node{

            k key;
            v value;

            public Node(k key , v value){
                this.key = key;
                this.value = value;
            }
        }

       private int n; // n
       private int N;
       private LinkedList<Node> buckets[]; //N
         
       @SuppressWarnings("unchecked")

       public HashMap(){
           this.N = 4;
         
           this.buckets = new LinkedList[4];
           for(int i=0;i<4;i++){

              this.buckets[i] = new LinkedList<>();
              
           }
       }

       public void put(k key,v value){
          int bi= hashFunction(key);
          int di = searchInLL(key,bi);
          if(di !=-1){
            Node node = buckets[bi].get(di);
            node.value = value; 
          }else{
            buckets[bi].add(new Node(key, value));
            n++;
          }

           double lamda = (double)n/N;
           if(lamda > 2.0){
            rehash();
           }
       }

      private void rehash() {
         LinkedList<Node> oldBack[] = buckets;
         buckets = new LinkedList[N*2];
         N = 2*N;

         for(int i=0;i<buckets.length;i++){
           buckets[i] = new LinkedList<>();
         }

        //  NOde  add in bucket
        for(int i =0;i<oldBack.length;i++){
           LinkedList<Node> ll = oldBack[i];
            for(int  j=0;j<ll.size();j++){
              Node node = ll.remove();
              put(node.key, node.value);
            }
        }
      }

      private int searchInLL(k key, int bi) {
        LinkedList<Node> ll = buckets[bi];
         int di=0;
        for(int i=0;i< ll.size();i++){
          Node node = ll.get(i);
          if(node.key == key ){
            return di;
          }
          di++;
        }
        return -1;
      }

      private int hashFunction(k key) {

        int hc = key.hashCode();
         return Math.abs(hc)%N;
      }

  // contain key
      boolean containeKey(k key){
          int bi= hashFunction(key);
          int di = searchInLL(key,bi);
          if(di !=-1){
            return true;
          }else{
           
          return false;
       }
      }

       public v remove(k key){
           int bi= hashFunction(key);
          int di = searchInLL(key,bi);
          if(di !=-1){
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
          }else{
            return null;
          }
       }


       public v get(k key){
         int bi= hashFunction(key);
          int di = searchInLL(key,bi);
          if(di !=-1){
            Node node = buckets[bi].get(di);
            return node.value;
          }else{
           return null;
          }
          
       }

       public ArrayList<k> keySet(){
        ArrayList<k> keys = new ArrayList<>();

        for(int i=0;i<buckets.length;i++){
          LinkedList<Node> ll = buckets[i];
          for(Node node : ll){
            keys.add(node.key);
          }
        }
           return keys;
       }
       
       public boolean isEmpty() {
         return n==0;
       } 

    }
    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("china", 5208);
        hm.put("India", 83215652);
        hm.put("us", 782926574);
        hm.put("nepal", 458752);

        // ArrayList<String> keys = hm.keySet();
        // for(String st:keys){
        //   System.out.println(st);
        // }

        System.out.println(hm.get("India"));

        hm.remove("India");
          System.out.println(hm.get("India"));
    }

}
