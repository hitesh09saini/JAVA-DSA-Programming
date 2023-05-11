public class Super {
 
    
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}


class Animals{

    Animals(){
        System.out.println("animal constructor is called");
    }
}

class Dog extends Animal{

    Dog(){
        super();
        System.out.println("Hourse constrector is called");
    }

   
}