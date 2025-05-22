package Solve.Interface;

interface Machine{
    void start();
    abstract void stop();
}

class Robot implements Machine{
    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
public class P17 {
    public static void main(String[] args) {
        Robot a = new Robot();
        a.start();
        a.stop();
    }
}
