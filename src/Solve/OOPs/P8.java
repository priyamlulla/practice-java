package Solve.OOPs;

class Vehicle{
    void startEngine(){
        System.out.println("Engine starts");
    }
}
class Car1 extends Vehicle{
    void drive(){
        System.out.println("car driving");
    }
}
public class P8 {
    public static void main(String[] args) {
        Car1 key = new Car1();
        key.startEngine();
        key.drive();
    }
}
