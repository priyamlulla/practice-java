package Basic;//print fibonachi series
import java.util.*;
public class fibbnonachi {
    public static void main(String[] args) {
        int a=0,b=1,n;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i>2) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
            if (i==2) {
                System.out.print(b + " ");
            }
            if (i==1){
                System.out.print(a + " ");
            }
        }
    }
}
