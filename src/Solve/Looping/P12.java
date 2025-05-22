package Solve.Looping;

public class P12 {
    public static void main(String[] args) {
        int no = 1234;
        int sum = 0;
        while (no != 0) {
            sum = sum + (no % 10);
            no = no / 10;
        }
        System.out.println(sum);
    }
}
