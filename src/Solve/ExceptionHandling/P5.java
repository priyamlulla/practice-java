package Solve.ExceptionHandling;

public class P5 {
    public static void main(String[] args) {
        int a = 7 ;
        int b = 4 ;

        try {
            int grt = (a < b) ? b : a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println(" code is finished!!");
        }
    }
}
