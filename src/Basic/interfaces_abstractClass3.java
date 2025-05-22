package Basic;

interface TvRemote{

}
class Tv implements TvRemote{

}
abstract class Telephone {
    abstract void ring();

    abstract void disconnect();

    abstract void lift();
}

class Smartphone extends Telephone implements TvRemote{
    public void ring() {
        System.out.println("ringing...");
    }

    public void disconnect() {
        System.out.println("disconnecting...");
    }

    public void lift() {
        System.out.println("lifting...");
    }

}

public class interfaces_abstractClass3 {
    public static void main(String[] args) {
        //polymorfhism
        Telephone obj = new Smartphone();
        obj.disconnect();
        obj.lift();
        obj.ring();
    }
}
