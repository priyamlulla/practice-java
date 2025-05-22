package Basic;

import java.util.Scanner;

public class Amstroong_No {
    public static void main(String[] args) {

        // To checkif any digit given no. is amstrong or not
       //153=1^3+5^3+3^3=153

            int n,d,r=0,m,b,a=0,c;
        System.out.println("enter any digit no.");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
            m=n;
            b=n;
            for( ;n!=0; )
            {
                d= n% 10;
                r=r+1;
                n= n/10;
            }
            for(;b!=0;)
            {
                c=b%10;
                a= (int) (a+(Math.pow(c,r)));
                b= b/10;
            }
            if(m==a)
            {
                System.out.println(m + " is a amstrong no.");
            }
            else
            {
                System.out.println(m + " is a not amstrong no.");
            }


        }
    }

