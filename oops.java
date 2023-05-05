import javax.xml.transform.Source;

public class oops {

    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("red");
        p.setTip(4);
        
        System.out.println(p.getColor());
        System.out.println(p.getTip());

        student s = new student();
        s.calcPercentage(5, 9, 6);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "hitesh";
        System.out.println(myAcc.username);

        myAcc.setPassword("SSSS9784");

    }
}

class Pen {
    // propertiy

    private String color;
    private int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    String getColor() {
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }
}

class student {

    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
        System.out.println(percentage);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}