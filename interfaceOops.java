public class interfaceOops {
 
    
    public static void main(String[] args) {
        Queen q  = new Queen();
        q.moves();
        q.eat();
    }
}

interface Chessplayer{
    void moves();
}

interface beer{
    void eat();
}

class Queen implements Chessplayer ,beer{

    public void moves(){
        System.out.println("up, down, left, ridht, diagnal");
    }
    public void eat(){
        System.out.println("eat some thing");
    }
}
