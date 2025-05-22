package Solve.Array;
//find pair in array -> sum = 10

public class P10 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 10;

        for( int i = 0 ; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((arr[i] + arr[j] == target) && (i != j) ){
                    System.out.println("(" + arr[i] + ',' + arr[j] + ")");
                }
            }
        }
    }
}
