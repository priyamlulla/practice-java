package Basic;

class firstExample{
   void add(int x, int y){
     int z;
     z=x+y;
       System.out.println("add of 1 nd 4 = " + z);
   }

   int mult(int x, int y) {
    int z;
    z=x*y;
    return z;
   }
}


public class javaMethodCall {
    public static void main(String[] args) {
        System.out.println("Basic.process started!");
        firstExample obj = new firstExample();
        obj.add(1,4);
        firstExample a = new firstExample();
        int d = a.mult(1,4);
        System.out.println("mult of 1 and 4 is =" + d );
    }
}
