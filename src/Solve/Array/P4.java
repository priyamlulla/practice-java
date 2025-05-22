package Solve.Array;
//chek if element is found

public class P4 {
    public static void main(String[] args) {
        int [] arr = {13,2,45,67,23};
        int ele = 4;

        for ( int i = 0 ; i < arr.length ; i ++){
            if (ele == arr[i]) {
                System.out.println(i);
                break;
            }
            else if ( i == (arr.length-1)){
                System.out.println("not found");
            }
        }

    }
}
