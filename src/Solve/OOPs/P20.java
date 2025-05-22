package Solve.OOPs;

abstract class Shaape {
    abstract void area();
}


class rectangle extends Shaape{
    @Override
    void area() {
        System.out.println("rectangle has area");
    }
}

class circle extends Shaape{
    @Override
    void area() {
        System.out.println("circle has area");
    }
}
public class P20 {
    public static void main(String[] args) {
        rectangle re = new rectangle();
        circle cr = new circle();

        re.area();
        cr.area();
    }
}
