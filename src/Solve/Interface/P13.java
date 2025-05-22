package Solve.Interface;

abstract class Game{
    abstract void play();
}
public class P13 {
    public static void main(String[] args) {
        Game footbal = new Game() {
            @Override
            void play() {
                System.out.println("playing Football");
            }
        };
        Game cricket = new Game() {
            @Override
            void play() {
                System.out.println("playing Cricket");
            }
        };
        footbal.play();
        cricket.play();
    }
}
