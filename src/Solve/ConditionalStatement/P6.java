package Solve.ConditionalStatement;
//leap year or not

public class P6 {
    public static void main(String[] args) {
        int yr = 1900;

        if ( ( ( yr % 4 == 0 ) && ( yr % 100 != 0) ) || ( yr % 400 == 0) ){
            System.out.println( yr + "  is a leap year");
        }
        else System.out.println(yr + " is not a leap year");
    }
}
