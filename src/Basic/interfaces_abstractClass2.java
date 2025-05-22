package Basic;

class Monkey{
    void jump(){
        System.out.println("monkey jumping...");
    }
    void bite(){
        System.out.println("monkey biting...");
    }
}
interface BasicHumanFunctionality{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicHumanFunctionality{
    void speaks(){
        System.out.println("human speaking...");
    }
    public void eat(){
        System.out.println("human eating ..");
    }

    @Override
    public void sleep() {
        System.out.println("human sleeping...");
    }
}

public class interfaces_abstractClass2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.eat();
        h.sleep();
        h.bite();
        //polymorphism
        Monkey m = new Human();
        m.bite();
        m.jump();
    }
}
