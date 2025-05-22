package Solve.OOPs;

class Person{
    String name[]= new String[10];
    int age[] = new int[10];
    int i = 1;
    Person(String n , int ag){
        this.age[i]=ag;
        this.name[i]= n;
        i++;
    }

    void isEquals(){

    }
}
public class P5 {
    public static void main(String[] args) {
        Person p = new Person("Priyam" , 19);
        Person q = new Person("Miskin" , 20);
    }
}
