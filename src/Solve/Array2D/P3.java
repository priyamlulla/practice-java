package Solve.Array2D;

public class P3 {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] res = new int[2][2];

        for(int i = 0 ; i < mat1.length ; i++) {
            for (int j = 0; j < mat1.length; j++) {
                res [i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0 ; i < mat1.length ; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
