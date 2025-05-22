package Solve.Interface;

interface  Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Duck implements Flyable , Swimmable {
    @Override
    public void swim() {
        System.out.println("is swimming");
    }

    @Override
    public void fly() {
        System.out.println("is flying");
    }
}
public class P16 {
    public static void main(String[] args) {
        Duck obj = new Duck();
        obj.fly();
        obj.swim();
    }
}
