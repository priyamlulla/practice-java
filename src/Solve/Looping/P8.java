package Solve.Looping;

public class P8 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
