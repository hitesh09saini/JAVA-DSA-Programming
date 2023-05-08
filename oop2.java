public class oop2 {
    
    public static void main(String[] args) {
         Student s =  new  Student();
         s.name = "hitesh ";
         s.roll = 234390;
         s.marks[0]=90;
         s.marks[1]=100;
         s.marks[2]=80;

        Student s1  = new Student(s);

        System.out.println(s1.name);
        for(int i =0 ; i < 3 ; i++){
            System.out.println(s1.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int  i =0 ;i< marks.length ;i++){
            this.marks[i]=s1.marks[i];
        }


    }

    Student(){
       marks = new int[3];
       System.out.println("Constructor is called ......");
    }
}
