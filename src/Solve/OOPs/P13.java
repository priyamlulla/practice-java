package Solve.OOPs;

class Shapee {
    void draw(){
        System.out.println("draw shape");
    }
}
class Circle extends Shapee{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Square extends Shapee{
    void draw(){
        System.out.println("Drawing square");
    }
}
public class P13 {
    public static void main(String[] args) {
        Shapee obj1 = new Circle();
        Shapee obj2 = new Square();
        obj1.draw();
        obj2.draw();

    }
}
