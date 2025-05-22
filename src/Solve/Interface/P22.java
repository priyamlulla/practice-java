package Solve.Interface;

@FunctionalInterface
interface MathOperation{
   int operate(int a, int b);
}
public class P22 {
    public static void main(String[] args) {
        MathOperation obj = (a,b)-> a*b;
        System.out.println(obj.operate(4,5));
    }

}
