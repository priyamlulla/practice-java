package Basic;

abstract class Pen {
    abstract void write();

    abstract void refil();
}

class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("in fountainpen write ");
    }

    @Override
    void refil() {
        System.out.println("in fountainpen refil ");
    }

    public void changeNib() {
        System.out.println("in fountain changenib");
    }
}

public class interfaces_abatractClass {
    public static void main(String[] args) {
        Pen p = new FountainPen();
        p.refil();
        p.write();
        FountainPen f = new FountainPen();
        f.changeNib();
        f.refil();
        f.write();
    }

}
