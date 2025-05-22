package Basic;

//count total paths in a maze (matrix) to move from [0,0] to [m,n]
public class recursion15 {
    public  static int count (int m,int n,int i,int j){
        if(i==m || j==n){
            return 0;
        }
        if (i==m-1 && j==n-1){
            return 1;
        }
        int downpath = count(m,n,i+1,j);
        int rightpath = count(m,n,i,j+1);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int total = count(m,n,0,0);
        System.out.println(total);
    }
}
