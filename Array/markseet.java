import java.util.Scanner;

public class markseet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println();
        System.out.print("your Father's name: ");
        String fatherName = s.nextLine();
        System.out.println();
        System.out.print("Mother's name: ");
        String motherName = s.nextLine();
        System.out.println();
        System.out.print("Class: ");
        int clas = s.nextInt();
        System.out.println();
        System.out.print("Roll No: ");
        int rollNo = s.nextInt();

        System.out.println(
                "Enter your Subject related Marks according this series, English, Hindi, Maths, Chemistry, Physics :");
        int english = s.nextInt();
        int hindi = s.nextInt();
        int math = s.nextInt();
        int chemistry = s.nextInt();
        int physics = s.nextInt();

        float totalMarks = 100 + 100 + 70 + 70 + 70;
        float obtainMarks = english + hindi + math + chemistry + physics;

        System.out.println("\n\n\n\n\n");
      

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t MarksSheet");
        // print marksSheet
        System.out.println("Enter your name: " + name);
        System.out.println("your Father's name: " + fatherName);
        System.out.println("Mother's name: " + motherName);
        System.out.println("Class: " + clas);
        System.out.println("Roll No: " + rollNo);

        // num
        System.out.println("S.No.   Subject\t\t\t\t\tMarks       out of");
        System.out.println("1.        English\t\t\t" + english + "      100");
        System.out.println("2.        Hindi\t\t\t\t" + hindi + "        100");
        System.out.println("3.        Math\t\t\t\t" + math + "          70");
        System.out.println("4.        Chemistry\t\t" + chemistry + "     70");
        System.out.println("5.        Physcis\t\t\t\t" + physics + "       70");

        System.out.println("Obtained marks: " + obtainMarks);
        System.out.println("Average marks: " + obtainMarks / 5);
        System.out.println("Persentage: " + (obtainMarks / totalMarks) * 100 + "%");

    }

}
