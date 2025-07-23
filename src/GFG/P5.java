package GFG;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>=b){
            if(a>=c){
                System.out.println("a is greater"+ a);
            } else if (c>=b) {
                System.out.println("c is greater"+ c);
            }
        } else if (b>=c) {
            System.out.println("b is greater"+ b);
        }else System.out.println("c is greater" + c);
    }
}
