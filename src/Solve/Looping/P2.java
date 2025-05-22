package Solve.Looping;

public class P2 {
    public static void main( String [] args){

        int n = 1;
        while ( n <= 100 ){
            if ( n % 7 == 0 ){
                System.out.print( n + " " );
                break;
            }
            n++;
        }
    }
}
