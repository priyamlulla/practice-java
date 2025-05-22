package Basic;

//create a coustum class get inp of name and salary and print the info of employe
class Employee{
    int salary;
    String name;

    public String getName(){
        return name;
    }
    public int  getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
        return;
    }
    public void setSalary(int a){
        salary=a;
        return;
    }
}

public class coustumClass1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Priyam");
        System.out.println(obj.getName());
        obj.setSalary(2000);
        System.out.println(obj.getSalary());
    }
}
