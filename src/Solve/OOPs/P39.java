package Solve.OOPs;

final class ImmutablePoint{
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "coordinates of space = " + x  + " " + y;
    }
}

public class P39 {
    public static void main(String[] args) {
        ImmutablePoint a = new ImmutablePoint(1,32);
        System.out.println(a);
    }
}
