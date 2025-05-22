package Basic;//stone paper sissors with machine
import java.util.*;
import java.util.Random;
public class javaProjectStonePaperSissors {
    public static void main(String[] args) {
        int m_no;
        int h_no=0;
        int n=1;
        System.out.println("lets play stone paper sissors");
        while(n!=0) {
            Random no = new Random();
            m_no = no.nextInt(1, 4);
            System.out.println("Enter stone or paper or scissors");
            Scanner sc = new Scanner(System.in);
            String scr = sc.next();
            if (scr.equals("stone") == true) {
                h_no = 1;
            }else if (scr.equals("paper") == true) {
                h_no = 2;
            }else if (scr.equals("scissors") == true) {
                h_no = 3;
            }
            else {
                System.out.println("invalid input ");
                continue;
            }
            System.out.println("you played :" + scr);

            if(m_no==1){
                System.out.println("machine played : stone");
            } else if (m_no==2) {
                System.out.println("machine played : paper");
            }else {
                System.out.println("machine played : scissors");
            }

            if ((h_no == 1 && m_no == 1) || (h_no == 2 && m_no == 2) || (h_no == 3 && m_no == 3)) {
                System.out.println("it's a tie!");
            }
            if ((h_no == 1 && m_no == 3) || (h_no == 2 && m_no == 1) || (h_no == 3 && m_no == 2)) {
                System.out.println("you won!! \t well played");
            }
            if ((h_no == 1 && m_no == 2) || (h_no == 2 && m_no == 3) || (h_no == 3 && m_no == 1)) {
                System.out.println("you lost!! \t well played");
            }

            System.out.println("want to play again? type y for yes and n for no");
            Scanner s = new Scanner(System.in);
            String g = s.next();
            if (g.equalsIgnoreCase("y")) {
                n++;
            } else {
                n=0;
            }
        }
        System.out.println("thanks for playing");
    }
}