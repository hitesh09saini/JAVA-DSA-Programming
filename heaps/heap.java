package heaps;

import java.util.ArrayList;

public class heap {
    static class Heap{
         ArrayList<Integer> arr = new ArrayList<>();

         public void add(int data) {
            arr.add(data);
            int par = (arr.size()-2)/2; // par index
            int x = arr.size()-1;  // child index

            while(arr.get(x)<arr.get(par)){  // O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }  

         }

         public void Print() {
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            
         }

         public int getMin() {
            return arr.get(0);
         }

        private void heapify(int i) {
                 int min =i;
                 int left = 2*i+1;
                 int right = 2*i+2;

                if(left < arr.size() && right< arr.size()){
         
                 if(arr.get(min)>arr.get(left)){
                   min = left;
                 }
                 if(arr.get(min)>arr.get(right)){
                   min = right;
                 }
                }

                if(min != i){
                    //  swap
                    int temp = arr.get(i);
                    arr.set(i, arr.get(min));
                    arr.set(min, temp);

                    heapify(min);
                }
        }


        public int remove() {
            if(arr.isEmpty()){
                return -1;
            }
            int data  = arr.get(0);

            // step 1
              int temp = arr.get(0);
              arr.set(0, arr.get(arr.size()-1));
              arr.set(arr.size()-1, temp);

            //  step 2

            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return data;

         }

         public boolean isEmpty() {
            return arr.size()==0;
         }



        //  heap sort 


    }

    
    public static void main(String[] args) {
        Heap h =new Heap();
        h.add(1);
        h.add(4);
        h.add(6);
        h.add(10);
        h.add(3);

       
    
       System.out.println(h.remove());
       
         
    }
}
