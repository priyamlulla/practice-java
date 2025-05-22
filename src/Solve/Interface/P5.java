package Solve.Interface;

class Outer{
    class Inner{
        void show(){
            System.out.println("i am in the Inner class show method contained by Outer class");
        }
    }
}
public class P5 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.show();
    }
}
