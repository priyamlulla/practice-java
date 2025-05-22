package Solve.Interface;

interface MobilePhone{
    void call();
    void text();
}
class Smartphones implements MobilePhone{
    @Override
    public void call() {

    }

    @Override
    public void text() {

    }
}
public class P15 {
    public static void main(String[] args) {
        Smartphones a = new Smartphones();
        a.call();
        a.text();
    }
}
