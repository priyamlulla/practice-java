package Solve.Array;
//remove duplicate frrom array

public class P8 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,3,4,4,4,5,5};
        int [] arrn = new int[arr.length];
        int a=0;

        for(int i = 0 ; i < arr.length; i ++){
            for (int j = i+1 ; j < arr.length ; j++ ){
                if ( arr[i] == arr[j]){
                    i = j;
                }
            }
            arrn [a] = arr[i];
            a++;
        }

        for ( int k = 0 ; k< a ; k++){
            System.out.println(arrn[k]);
        }
    }
}
