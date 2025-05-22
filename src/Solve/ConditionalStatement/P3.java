package Solve.ConditionalStatement;
//find largent no

public class P3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c = 1;

        if ( ( a > b ) && ( a > c ) ){
            System.out.println( "a = " + a + " is greatest");
        } else if ( ( b > a ) && ( b > c )) {
            System.out.println( "b = " + b + " is greatest");
        }else System.out.println( "c = "+ c + " is greatest");
    }
}
