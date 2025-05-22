package Solve.Looping;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("showing menu...");
            System.out.println("to exit screen type 3");
            option = sc.nextInt();
        }
        while (option != 3);
    }
}
