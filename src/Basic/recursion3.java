package Basic;

//print x to the power n using Basic.recursion but stack level is log n
public class recursion3 {
    public static int calc(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0){
            return 0;
        }
        if(n%2==0) {
            return calc(x, n / 2) * calc(x, n / 2);
        }
        else{
            return calc(x, n / 2) * calc(x, n / 2)*x;
        }
    }
    public static void main(String[] args) {
        int n=2,x=2;
       int b= calc(x,n);
        System.out.println(b);
    }
}
