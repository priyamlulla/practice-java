package Solve.OOPs;

class Bird{
    void fly(){
        System.out.println("Birds flyies");
    }
}
class Penguin extends Bird{
    @Override
    void fly(){
        System.out.println("Penguin cant fly");
    }
}
public class P10 {
    public static void main(String[] args) {
        Penguin brd = new Penguin();
        brd.fly();
    }
}
