package Solve.Array;
//sort an array in assending order

public class P9 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

        for( int i = 0 ; i < arr.length-1 ; i++){
            for( int j = i ; j < arr.length ; j++){
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for ( int a : arr){
            System.out.println(a);
        }
    }
}
