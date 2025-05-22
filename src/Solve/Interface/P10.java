package Solve.Interface;

class Animal {
    void makeSound(){
        System.out.println("making sound");
    }
}
public class P10 {
    public static void main(String[] args) {
        Animal dog = new Animal(){
            @Override
            void makeSound() {
                System.out.println("bark bark...");
            }
        };
        dog.makeSound();
    }
}
