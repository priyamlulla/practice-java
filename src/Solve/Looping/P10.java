package Solve.Looping;

public class P10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if( i % j == 0 ){
                    break;
                }else
                System.out.print(i + " ");
            }
        }
    }
}
