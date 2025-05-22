package Solve.OOPs;

interface Playables{
    void play();
}
class Guitar implements Playables{
    public void play(){
        System.out.println("in guitar");
    }
}
class Piano implements Playables{
    public void play(){
        System.out.println(" in piano");
    }
}
public class P14 {
    public static void main(String[] args) {
        Playables p = new Guitar();
        Playables p1 = new Piano();
        p.play();
        p1.play();
    }
}
