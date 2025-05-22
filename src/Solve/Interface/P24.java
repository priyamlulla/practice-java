package Solve.Interface;

interface Comparison{
    boolean compare(int a, int b);
}
public class P24 {
    public static void main(String[] args) {
        Comparison isGreater = (x,y)-> x>y;
        Comparison isLess = (x,y) -> x<y;
        Comparison isEqual = (x,y) -> x==y;

        System.out.println(isEqual.compare(5,6));
        System.out.println(isGreater.compare(5,6));
        System.out.println(isLess.compare(5,6));
    }
}
