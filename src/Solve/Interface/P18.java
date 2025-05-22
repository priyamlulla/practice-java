package Solve.Interface;

interface Veechicle {
    void move();
}
interface ElectricVehicle extends Veechicle{
    void charge();
}

class Tesla implements ElectricVehicle {
    @Override
    public void move() {

    }

    @Override
    public void charge() {

    }
}
public class P18 {
    public static void main(String[] args) {
        Tesla a = new Tesla();
        a.charge();
        a.move();
    }
}
