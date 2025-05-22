package Solve.Interface;

class car{
    static class Engine{
        void startEngine(){
            System.out.println("Engine started ");
        }
    }
}
public class P7 {
    public static void main(String[] args) {
        car.Engine a = new car.Engine();
        a.startEngine();
    }
}
