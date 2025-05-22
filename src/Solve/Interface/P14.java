package Solve.Interface;

interface Drivable{
    void drive();
}
class Carr implements Drivable{
    @Override
    public void drive() {
        System.out.println("driving car");
    }
}
class Bike implements Drivable{
    @Override
    public void drive() {
        System.out.println("driving bike");
    }
}
public class P14 {
    public static void main(String[] args) {
        Carr a = new Carr();
        a.drive();
        Bike b = new Bike();
        b.drive();
    }
}
