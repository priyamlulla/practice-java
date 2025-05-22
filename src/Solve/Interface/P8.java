package Solve.Interface;

class House{
    static class Door{
        void open(){
            System.out.println("Door open");
        }
    }
    class Window{
        void open(){
            System.out.println("Window open");
        }
    }
}
public class P8 {
    public static void main(String[] args) {
        House obj = new House();
        House.Door a  = new House.Door();
        a.open();
        House.Window b = obj.new Window();
        b.open();
    }
}
