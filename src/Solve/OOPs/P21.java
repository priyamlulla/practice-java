package Solve.OOPs;

abstract class vehicle{
    abstract void fuel_capacity();
}

class Carr extends vehicle {
    @Override
    void fuel_capacity() {
        System.out.println("12");
    }
}

class MoterCycle extends  vehicle{
    @Override
    void fuel_capacity() {
        System.out.println("120");
    }
}
public class P21 {
    public static void main(String[] args) {
        Carr cr = new Carr();
        cr.fuel_capacity();
        MoterCycle a = new MoterCycle();
        a.fuel_capacity();
    }
}
