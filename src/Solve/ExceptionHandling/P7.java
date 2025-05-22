package Solve.ExceptionHandling;

class forMethod{
    void bhy () throws  Exception{
        System.out.println("do something");
    }
}
public class P7 {
    public static void main(String[] args) {
        forMethod a = new forMethod();
        try {
            a.bhy();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
