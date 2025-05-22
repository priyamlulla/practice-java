package Solve.OOPs;

@FunctionalInterface
interface Operation{
    int perform (int a , int b);
}
public class P27 {
    public static void main(String[] args) {
        Operation add =   (x , y)->  x+y ;
        Operation sub = (x,y) -> x>y?x-y:y-x;
        Operation mult = (x,y) -> x*y;
        int x=4 , y=6;
        System.out.println("Addition = " + add.perform(x,y));
        System.out.println("substraction =" + sub.perform(x,y));
        System.out.println("multiplycation =" + mult.perform(x,y));
    }
}
