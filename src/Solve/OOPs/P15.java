package Solve.OOPs;

class Vehiclee{

}
class Bike extends Vehiclee{

}
public class P15 {
    public static void main(String[] args) {
        Vehiclee obj = new Vehiclee();
        if(obj instanceof Vehiclee){
            System.out.println("obj is instance of Vehicle");
        }else {
            System.out.println("obj instance of Bike");
        }
        Bike obj1 = new Bike();
        if(obj1 instanceof Vehiclee){
            System.out.println("obj1 is instance of Vehicle");
        }else {
            System.out.println("obj1 instance of Bike");
        }
        Vehiclee obj2 = new Bike();
        if(obj2 instanceof Vehiclee){
            System.out.println("obj2 is instance of Vehicle");
        }else {
            System.out.println("obj2 instance of Bike");
        }
    }
}
