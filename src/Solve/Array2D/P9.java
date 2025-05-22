package Solve.Array2D;

public class P9 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arrF = new int[9];
        int co = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 arrF [co] = arr[i][j];
                 co++;
            }
        }

        for(int e : arrF){
            System.out.print(e + " ");
        }
    }
}
