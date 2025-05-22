package Solve.Array2D;

public class P11 {
    public static void main(String[] args) {
        int[][] jaggedArr = { {1, 2}, {3, 4, 5}, {6} };

        for (int i = 0 ; i < jaggedArr.length ; i++){
            for (int j = 0 ; j < jaggedArr[i].length ; j++){
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
