package Solve.OOPs;

class Animall {
    public void sleep(){
        System.out.println("can sleep");
    }
    public void eat(){
        System.out.println("can eat");
    }
}

class Cat extends Animall {
    public void fur(){
        System.out.println("is a cat");
    }
}

public class P16 {
    public static void main(String[] args){
        Animall a = new Cat();
        Cat b = ((Cat)a);
        b.fur();
        ((Cat) a).fur();
    }
}
