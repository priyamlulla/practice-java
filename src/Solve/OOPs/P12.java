package Solve.OOPs;

import java.util.Scanner;

class Calculator{
    void add(int a, int b){
        System.out.println("Addition of two int are :" + (a+b));
    }
    void add(float a , float b){
        System.out.println("Addition of two float are :" + (a+b));
    }
    void add(String a, String b){
        System.out.println("Addition of two string are :" + (a+b));
    }
}
public class P12 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two int to add");
        int ai = sc.nextInt();
        int bi = sc.nextInt();
        obj.add(ai, bi);
        System.out.println("enter two float to add");
        float af = sc.nextFloat();
        float bf = sc.nextFloat();
        obj.add(af,bf);
        System.out.println("enter two String to add");
        String as = sc.nextLine();
        String bs = sc.nextLine();
        obj.add(as,bs);

    }
}
