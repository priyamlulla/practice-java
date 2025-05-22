package Solve.Array2D;

public class P5 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}, {5, 6}};
        int[][] transpose = new int[2][3];

        for(int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 2 ; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        for(int i = 0 ; i < 2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
