package Solve.OOPs;

class Caar{
    static class Engine{
        void startEngine(){
            System.out.println("Engine   started");
        }
    }
}
public class P33 {
    public static void main(String[] args) {
        Caar.Engine a = new Caar.Engine();
        a.startEngine();
    }
}
