package Solve.OOPs;

interface Animalll{
    default void sleep(){
        System.out.println("sleeping");
    }
}
class Dog0 implements Animalll{

}
public class P26 {
    public static void main(String[] args) {
        Dog0 w = new Dog0();
        w.sleep();
    }
}
