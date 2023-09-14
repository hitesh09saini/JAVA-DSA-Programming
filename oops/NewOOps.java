public class NewOOps {

    public static void main(String args[]){

        // Pen p = new Pen();
        // p.color = "red";
        // p.tip = 4;

        // System.out.println(p.color +" "+ p.tip);

        // Students s = new Students();

        // s.name = "Hitesh";
        // s.age = 4;
        // s.per = 90;

        // System.out.println(s.name+" "+s.age+" "+s.per);

        BankAccount b = new BankAccount();

        b.userName = "hitesh";
    
        b.setPassword("Hitesh");
       

        
    }
    
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {

        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Students {

    String name;
    int age;
    float per;

    void calcPer(int phy, int chem, int math){
        per = (phy+chem +math)/3;
    }

}

class BankAccount{

  public String  userName;
  private String password;


  public void setPassword(String pass){
        this.password = pass;
  }

}