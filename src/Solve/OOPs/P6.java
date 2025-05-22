package Solve.OOPs;

class BankAccount{
    static int interestRate;
    void show(){
        System.out.println(interestRate);
    }
}
public class P6 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        BankAccount c = new BankAccount();
        a.interestRate = 23;
        b.interestRate = 45;
        c.interestRate = 99;
        a.show();
        b.show();
        c.show();

    }
}