public class comapir {
    
    public static void main(String[] args) {
        String st = "race car";
        StringBuilder neStr =new StringBuilder();
        for(int i =st.length()-1;i>=0;i--){
            neStr.append(st.charAt(i)) ;
        }
        
        System.out.println(">>"+neStr);
    }
}
