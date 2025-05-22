package Solve.OOPs;

class Car{
    void make(){
        System.out.println("TATA");
    }
    void model(){
        System.out.println("some model!!!");
    }
    void year(){
        System.out.println("3000");
    }
}
public class P1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.make();
        obj.model();
        obj.year();
    }
}
