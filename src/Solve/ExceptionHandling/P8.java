package Solve.ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a ;
        try {
            a = sc.nextInt();
            System.out.println(a);
            throw new IOException();
        } catch (Exception i) {
            System.out.println(i);
        }

    }
}
