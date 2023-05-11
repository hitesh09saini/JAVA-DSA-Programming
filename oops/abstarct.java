public class abstarct {
    public static void main(String[] args) {
        Hourse h = new Hourse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Hourse extends Animal {

    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chiken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}