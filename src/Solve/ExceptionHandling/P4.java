package Solve.ExceptionHandling;

public class P4 {
    public static void main(String[] args) {
        int a = 9;
        int b = 0 ;
        int [] arr = {1,2,3,4};

        try{
            System.out.println(a/b);
            int r = arr[4];
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
