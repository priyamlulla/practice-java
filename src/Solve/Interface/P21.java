package Solve.Interface;

@FunctionalInterface
interface Greetable{
    void greet();
}
public class P21 {
    public static void main(String[] args) {
        Greetable a = ()-> System.out.println("Greeting");
        a.greet();
    }
}
