package Basic;

//count ways to place a tiles of size 1xm in a floor of nxn
public class recursion16 {
    public static int place (int n,int m) {
        if (m == n) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        return place(n - m, m) + place(n-1, m );
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int a = place(n,m);
        System.out.println(a);
    }
}
