

public class reverseKthele{

    public static void main(String[] args) {
        String A = "hitesh";
       
        int arr[] = new int[26];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<A.length();i++){
            
            if(arr[A.charAt(i)-'a'] == 0){
                sb.append(A.charAt(i));
            }else{
                sb.append('#');
            }
            
            arr[A.charAt(i)-'a']++;
        }
        
        System.out.println(sb.toString());

    }
}