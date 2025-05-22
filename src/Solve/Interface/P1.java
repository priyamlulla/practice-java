package Solve.Interface;

abstract class Vechcle{
    abstract void fuelEfficiency();
}

class Car extends Vechcle{
    @Override
    void fuelEfficiency() {
        System.out.println("20%");
    }
}

class Motorcycle extends Vechcle{
    @Override
    void fuelEfficiency() {
        System.out.println("10%");
    }
}

public class P1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.fuelEfficiency();
        Motorcycle obj1 = new Motorcycle();
        obj1.fuelEfficiency();
    }
}
