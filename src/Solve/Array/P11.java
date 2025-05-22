package Solve.Array;
// check if subset or not

public class P11 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,4,5};
        boolean a = false;

        for( int i = 0 ; i < arr2.length ; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if ((arr2[i] != arr1[j]) && (j==arr1.length-1)){
                     a = true;
                    break;
                }else if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if(a){
                break;
            }
        }

        if (a){
            System.out.println("its is not a sub set");
        }else {
            System.out.println("it is a sub set");
        }
    }
}
