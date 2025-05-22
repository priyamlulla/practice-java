package Basic;//print fibonachi series using Basic.recursion

public class recursion {
    public static void math (int n , int a,int b ){
        if(n==0){
            return;
        }
            int c=a+b;
            System.out.print(c + " ");
            math (n-1,b,c);
    }
    public static void main(String[] args) {
        int n = 15;
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        math(n-2,a,b);
    }
}
