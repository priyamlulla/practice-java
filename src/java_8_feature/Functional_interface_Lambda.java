package java_8_feature;

@FunctionalInterface
interface A{
    void M1();    // functional interface only contain one abstract method M1 but can contain many default method
    default void s(){
        //somr code
    }
}

@FunctionalInterface
interface B{
    void M2();
}
@FunctionalInterface
interface C{
    void M3(int x,int y);
}
@FunctionalInterface
interface D {
    int  M4();
}
@FunctionalInterface
interface E {
    boolean M5 (int z);
}
public class Functional_interface_Lambda {
    public static void main(String[] args) {

        A a = () -> System.out.println("lamda expression"); //anonomys class expression
        a.M1();
        /* types of FunctionalInterface
            1.without parameter and without return type
            2.with parameter and without return type
            3.without parameter and with return type
            4.with parameter and with return type
         */

        //1
        B b = () -> System.out.println("in first type");
        b.M2();
        //2
        C add = (int x , int y) -> System.out.println("in second type");
        add.M3(5,6);
        //3
        int t = 4;
        D no = () -> {
            System.out.println("in third type");
            return t;
        };
        no.M4();
        //4
        E isEven = (r5) -> r5%2==0;
        E isPositive = (r6) -> {
            System.out.println("in fourth type"); // block lambda expression
            return r6 > 0;
        };

        isEven.M5(6);
        isPositive.M5(8);
        //note: lambda expression more than one statement is called block lambda exporession
    }
}
