package Solve.Interface;

@FunctionalInterface
interface Operation{
    int perform(int a , int b);
}
public class P20 {
    public static void main(String[] args) {

        Operation obj = (a,b)-> a+b;
        int d = obj.perform(4,5);
        System.out.println(d);
    }
}
