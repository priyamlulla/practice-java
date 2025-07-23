package GFG;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        int temp=0;
        for(int i = 1; i<=n ; i++){
            if(n%i==0){
                temp++;
            }
        }
        if(temp == 2){
            System.out.println("True");
        }else System.out.println("False");
    }
}
