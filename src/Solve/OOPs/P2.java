package Solve.OOPs;

class Employee{
    int salary;
    String name;
    Employee(){
        name = "Priyam";
        salary = 1_00_00_00;
    }
    void getDetails(){
        System.out.println(name + " : " + salary);
    }
}
public class P2 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getDetails();
    }
}
