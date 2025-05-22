package Solve.Interface;

abstract class Shape {
    abstract void area();
    void draw(){
        System.out.println("drawing :" + "shape");
    }
}

class Rectangle extends Shape{
    int area;
    @Override
    void area() {
        System.out.println("Area of Rectangle =" + area);
    }
    Rectangle(int area){
        this.area = area;
    }
}

class Circle extends Shape{
    int area;
    @Override
    void area() {
        System.out.println("Area of Circle =" + area);
    }
    Circle(int area){
        this.area = area;
    }
}
public class P2 {
    public static void main(String[] args) {
        Rectangle b = new Rectangle(12);
        Circle c = new Circle(56);
        b.area();
        c.area();
    }
}
