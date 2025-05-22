package Solve.Array2D;

public class P13 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int temp = 0;
        int temp2 = 0;
        for(int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (i==0 || (i==1 && j ==2)) {
                   temp = mat[i][j] ;
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

                temp2 = mat[i][0];
                mat[i][0] = mat[i][2];
                mat[i][2] = temp2;

        }
        for(int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
