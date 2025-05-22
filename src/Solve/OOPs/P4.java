package Solve.OOPs;

import java.util.Scanner;

class Rectangle{
    Rectangle(){
        System.out.println(" l is 2m and b is 3m");
    }
    Rectangle(int l , int b){
        System.out.println("l = " + l + "b = " + b);
    }
}
public class P4 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("give me dimention of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        new Rectangle(l,b);
    }
}
