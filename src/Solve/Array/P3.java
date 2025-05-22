package Solve.Array;
//greatest element in an array

public class P3 {
    public static void main(String[] args) {
        int a [] = {1,4,67,80};
        int grt = a[0];

        for ( int i = 1 ; i < a.length ; i++){
            if ( grt < a[i]){
                grt = a[i];
            }
        }

        System.out.println("the greatest element = " + grt);
    }
}
