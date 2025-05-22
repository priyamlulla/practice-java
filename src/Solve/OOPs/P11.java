package Solve.OOPs;

import java.util.Scanner;

class Employeee{
    Employeee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of employee");
        String name1 = sc.nextLine();
    }
}
class Manager extends Employeee{
    Manager(){
        super();
    }
}
public class P11 {
    public static void main(String[] args) {
        Manager hr = new Manager();
    }
}
