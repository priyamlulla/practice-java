package Solve.Interface;

abstract class Payment{
    abstract void pay();
}
public class P12 {
    public static void main(String[] args) {
        Payment a = new Payment() {
            @Override
            void pay() {
                System.out.println("Paying fees");
            }
        };
        a.pay();
    }
}
