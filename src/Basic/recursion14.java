package Basic;

//count no of ways to invite people to a party they either can come in pair or single using Basic.recursion
public class recursion14 {
    public static int count(int n){
        if (n<=1){
            return 1;
        }
        int single = count (n-1);
        int min = (n-1) * count(n-2);
        return single+min;
    }
    public static void main(String[] args) {
        int n = 4;
        int a = count(n);
        System.out.println(a);
    }
}
