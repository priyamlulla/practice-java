package Solve.Interface;
abstract  class Appliance{
    String brand ;
    Appliance(String brand){
        this.brand = brand;
        System.out.println(brand);
    }
}

class  WashingMachine extends Appliance{
    WashingMachine( String brand){
        super(brand);
    }
}
class Refrigerator extends Appliance{
    Refrigerator(String brand){
        super(brand);
    }
}
public class P3 {
    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine("sony");
        Refrigerator obj1 = new Refrigerator("Sony");
    }
}
