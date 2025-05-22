package Solve.ExceptionHandling;

class man{
    void talk(){
        System.out.println("Talking!!");
    }
}
public class P2 {
    public static void main(String[] args) {
        man obj = null;

        try{
            obj.talk();
        }catch (NullPointerException nll){
            System.out.println(nll);
        }

    }
}
