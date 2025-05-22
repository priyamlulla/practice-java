package Solve.Array;
//reverse an array

public class P5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int j = arr.length;
        int [] arn = new int[j];

        for ( int i = 0 ; i < arr.length ; i++){
            arn[j-1] = arr[i];
            j--;
        }

        for (int a : arn){
            System.out.println(a);
        }

    }
}
