package Solve.Interface;

class Person{
    String name = "priyam";
    class Details {
        void printName (){
            System.out.println("name of person is :" + name);
        }
    }
}
public class P6 {
    public static void main(String[] args) {
        Person a = new Person();
        Person.Details b = a.new Details();
        b.printName();
    }
}
