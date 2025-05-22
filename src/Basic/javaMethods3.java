package Basic;//factorial of a no using recussion
import java.util.*;
public class javaMethods3 {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        if (n<0){
            System.out.println("invalid input");
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int fac = factorial(n);
        System.out.println(n + "% = " + fac);
    }
}
