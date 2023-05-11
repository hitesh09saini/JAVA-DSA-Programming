public class Static {
   
    public static void main(String[] args) {
        
        Student s = new Student();
        s.school = "GB";
        s.setName("hitesh");

        Student s1 = new Student();
         System.out.println(s1.school);
    }
}


class Student{
    String name;
    int roll;

  
    static String school;

    void setName(String name ){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}