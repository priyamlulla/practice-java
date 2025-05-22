package Solve.Array2D;

public class P7 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int ele = 0;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == ele) {
                    System.out.println("(" + i + "," + j + ")");
                    break;
                } else if (arr[i][j] != ele && i == 2 && j == 2) {
                    System.out.println("not found");
                }
            }
        }


    }
}
