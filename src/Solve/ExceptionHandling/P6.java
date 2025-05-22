package Solve.ExceptionHandling;

class PriyamException extends Exception{
    PriyamException (){
        super (" it is a costum exception");
    }
}

public class P6 {
    public static void main(String[] args) {
        int a = 5;

        try{
            System.out.println(a);
            throw new PriyamException();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
