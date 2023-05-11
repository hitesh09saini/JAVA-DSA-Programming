public class remove {
    public static void main(String[] args) {
        String str = "Hi3546789087654321 I536374@! *7am hit56879907645342esh#@!$%";
        StringBuilder st = new StringBuilder();

        for(int i =0;i<str.length();i++){

            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')||str.charAt(i)==' '){
              
               st.append(str.charAt(i));
            }
          
        }
        System.out.println(st);
    }
}
