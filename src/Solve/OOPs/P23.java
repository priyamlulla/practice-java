package Solve.OOPs;

interface Movables{
    void move();
}

class car implements Movables{
    @Override
    public void move() {
        System.out.println("is moving");
        // some code to move;
    }
}

class Bik implements Movables{
    @Override
    public void move() {
        System.out.println("is moving");
        // some code to move;
    }
}
public class P23 {
    public static void main(String[] args) {
        Bik b = new Bik();
        b.move();

        car c = new car();
        c.move();
    }
}
