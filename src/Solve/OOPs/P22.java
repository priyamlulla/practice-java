package Solve.OOPs;

abstract class Annimal{
    abstract void sound();
    void breadth(){
        System.out.println("is breadthing..");
    }
}

class Doog extends Annimal{
    @Override
    void sound() {
        System.out.println("bark!");
    }
}

class Caat extends Annimal{
    @Override
    void sound() {
        System.out.println("meow!!");
    }
}

public class P22 {
    public static void main(String[] args) {
        Doog a = new Doog();
        a.breadth();
        a.sound();
        Caat c = new Caat();
        c.breadth();
        c.sound();
    }
}
