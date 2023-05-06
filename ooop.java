public class ooop {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "hitesh"; 
        s.roll = 4223;
        s.marks[0]=80;
        s.marks[1]=90;
        s.marks[2]=100;


        Student s1 = new Student(s);
        s1.setPass("hitesh");
        
        System.out.println(s1.name);
        System.out.println(s1.marks[1]);
       
        
    }
}

class Student{
    int roll;
    String name;
    private String password;
    int marks[];


    public void setPass(String password){
        marks =new  int [3];
        this.password = password;
    }
    
    Student(Student s ){
        marks =new  int [3];
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;
        this.marks = s.marks;

    }
    Student(){
        marks =new  int [3];
    }

}
