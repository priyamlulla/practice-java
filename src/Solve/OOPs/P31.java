package Solve.OOPs;

class Outer{
    private int a;
    private String b;
    Outer(int a , String b){
        this.a=a;
        this.b=b;
    }
    class Inner{
        public void show(){
            System.out.println("demonstrated" + a + " "+  b );
        }
    }
}
public class P31 {
    public static void main(String[] args) {
        Outer obj = new Outer(12 , "jfjfj");
        Outer.Inner obj1 = obj.new Inner();
        obj1.show();

    }
}
