package Solve.Looping;

public class P5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,67,4,5};
        int max = arr[0];
        for (int n : arr){
            if ( n > max){
                max = n ;
            }
        }
        System.out.println(max);

    }
}
