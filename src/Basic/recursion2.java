package Basic;

//print x to the power n using Basic.recursion but stack level is n
public class recursion2 {
    public static int calc(int n,int x){
      if (n==0) {
          return 1;
      }
      if (x==0){
          return 0;
      }
      int a= calc(n-1,x);
      int b=x*a;
      return b;
    }
    public static void main(String[] args) {
        int n=5 , x=2;
       int b=  calc(n,x);
        System.out.println(b);
    }
}
