package Solve.ConditionalStatement;
//check no. is + - or 0

public class P1 {
    public static void main(String[] args) {
        int a = -4;

        if (a>0){
            System.out.println(a + " is positive");
        } else if (a<0) {
            System.out.println(a + " is negative");
        }else System.out.println(a + " is zero");
    }
}
