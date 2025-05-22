package Solve.Interface;

public class P9 {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running by Priyam");
            }
        };
        a.run();
    }
}
