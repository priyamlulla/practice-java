package Solve.Array2D;

public class P10 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row_start = 0;
        int row_end = 2;
        int colm_start = 0;
        int colm_end = 2;
        int i=0  , j = 2 ,k = 2 , l = 0;
        int count = 0;

        while (count != 9) {
            for (row_start=0 ; row_start <= row_end ; row_start++ ) {
                System.out.print(mat[i][row_start] + " ");
                count++;
            }
            for( colm_start = 1 ; colm_start <= colm_end ; colm_start++){
                System.out.print(mat[colm_start][j] + " ");
                count++;
            }
            for( row_end = 1 ; row_end >= row_start ; row_end--){
               System.out.print(mat[k][row_end] + " ");
               count++;
            }
            for (colm_end = 1 ; colm_end > colm_start ; colm_end-- ){
                System.out.print(mat[colm_end][l] + " ");
                count++;
            }
            if (row_start != row_end && colm_start != colm_end){
                row_start++ ;
                row_end--;
                colm_start++;
                colm_end--;
                i++;
                k++;
                j--;
                l--;
            }

        }
    }
}
