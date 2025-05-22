package Solve.OOPs;

class Shape{
    void position(){
        System.out.println("in class shape");
    }
}
class Polygon extends Shape{
    void position2(){
        System.out.println("in class polygon");
    }
}
class Triangle extends Polygon{
    void position3(){
        System.out.println("in classTriangle");
    }
}
public class P9 {
    public static void main(String[] args) {
        Triangle abc = new Triangle();
        abc.position3();
        abc.position2();
        abc.position();
    }
}