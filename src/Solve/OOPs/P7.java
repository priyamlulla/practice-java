package Solve.OOPs;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println(" Dog is Barking!!!!");
    }
}
public class P7 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}
