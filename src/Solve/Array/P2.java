package Solve.Array;
//calculate sum of an array

public class P2 {
    public static void main(String[] args) {
        int [] ar = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0 ; i < ar.length ; i++){
             sum  += ar[i];
        }

        System.out.println("sum = " + sum);
    }
}
