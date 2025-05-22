package Solve.Interface;

interface Calculator{
    static int add(int a , int b){
        return a+b;
    }
}
public class P19 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(4,4));
    }

}
