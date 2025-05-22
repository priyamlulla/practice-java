package Basic;//create a guess the no Basic.project machine will generate random no. from 0 to 100
//after guessing it will help to guess the correct no.
//use oops concept to create
import java.util.Random;
import java.util.Scanner;

class project{
    private int uNo,no;

    public int getuNo() {
        return uNo;
    }

    public void setuNo(int uNo) {
        this.uNo = uNo;
    }

    public int getNo() {
        return no;
    }

    boolean isCorrectInputNo(){
        if(uNo==no ) {
            System.out.println("yes you guessed it write!!");
            return true;
        } else if(uNo<no){
            System.out.println("Too low...");
        }else if(uNo>no){
            System.out.println("Too high...");
        }
        return false;
    }
     void takeUserInputNo(){
        Scanner sc = new Scanner(System.in);
         uNo = sc.nextInt();
    }
    project(){
        Random r = new Random();
        no = r.nextInt(0,101);
    }
}

public class guessNo {
    public static void main(String[] args) {
        boolean b=false;
        project obj = new project();

        while(!b) {
            obj.takeUserInputNo();
            b = obj.isCorrectInputNo();
        }
    }
}
