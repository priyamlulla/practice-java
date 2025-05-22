package Basic;//if no. is prime or not
import java.util.*;

public class javaMethods2 {

    public static int  prime(int a){
        int c=0;

        for(int i=1; i<=a; i++){
            if(a%i==0){
                c=c+1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
       int c= prime(n);
       if (c==2){
           System.out.println(n + "is a prime ");
       }
       else {
           System.out.println(n + "is not a prime ");
       }
    }
}
