package Solve.OOPs;

interface Swimables{
    void swim();
}
interface Flyables{
    void fly();
}
class Duck implements Swimables, Flyables {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
public class P24 {
    public static void main(String[] args) {
        Duck a = new Duck();
        a.fly();
        a.swim();
    }
}
