package Solve.OOPs;

class Account{
    private int accountNo = 100;
    private String Account_type = "saving";
    private int balance = 1_00_000;
    private int add;
    private int min;

    public int add_deposit(){
        return add;
    }
    public void deposit(int add){
        this.balance += add;
    }

    public int min_deposit(){
        return min;
    }
    public void withDraw(int min){
        if(balance-min >= 0){
            this.balance -= min;
        }
        else System.out.println("not Enough balance!!");
    }
    public void show(int accountNo , String Account_type){
        if(this.accountNo == accountNo && this.Account_type == Account_type ){
            System.out.println("Balance =" + balance);
        }
    }
}
public class P17 {
    public static void main(String[] args) {
        Account a = new Account();
        a.add_deposit();
        a.deposit(12);

        a.min_deposit();
        a.withDraw(12);

        a.show(100,"saving");

    }
}
