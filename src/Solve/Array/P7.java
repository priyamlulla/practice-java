package Solve.Array;
// rotate an array

public class P7 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        for (int i = 0 ; i < a.length-1 ; i++){
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;

        }

        for ( int e : a){
            System.out.println(e);
        }
    }
}
