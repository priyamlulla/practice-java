package Solve.Interface;

abstract class Employee{
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("your salary for full time work is : 2,00,000");
    }
}
class HalfTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("your salary for half time work is : 50,000");
    }
}
public class P4 {
    public static void main(String[] args) {
        FullTimeEmployee a = new FullTimeEmployee();
        a.calculateSalary();
        HalfTimeEmployee b = new HalfTimeEmployee();
        b.calculateSalary();
    }
}
