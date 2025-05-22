package Solve.Array2D;

public class P15 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        int count1 = 0;

        for(int i = 0 ; i < 3; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            if (i == 1) {
                for (int j = 2; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
