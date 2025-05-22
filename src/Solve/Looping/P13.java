package Solve.Looping;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int sum =0;
        System.out.println("write no one by one to add them give no 0 to end ");
        do{
            int n = sc.nextInt();
            if (n<0) {
                continue;
            }
            sum += n;
            if(n==0) flag=false;
        }while(flag);
        System.out.println(sum);
    }
}
