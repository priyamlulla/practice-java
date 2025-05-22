package Solve.Array2D;

public class P8 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumr [] = new int[3];
        int sumc [] = new int[3];

        for(int i = 0 ; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                sumr[i] = sumr[i] + mat[i][j] ;
                sumc[j] = sumc[j] + mat[i][j] ;
            }
        }

        for (int e : sumr){
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : sumc){
            System.out.print(e + " ");
        }
    }
}
