package Solve.Array2D;

public class P14 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum1 = 0 , sum2 = 0;

        for(int i = 0 ; i < 3; i++) {
            sum1 += mat[i][i];
            for (int j = 0; j < 3; j++) {
                if(i + j == 2){
                    sum2 += mat[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
