package Basic;
//for arthematic exception print haha , and for illegal argument exception print hehe

import java.util.Scanner;


public class Exception_Handling_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        try {
            System.out.println(a/b);
        }
        catch (IllegalArgumentException i){
            System.out.println("HeHe");
        }
        catch (ArithmeticException A){
            System.out.println("HaHa");
        }
    }
}
