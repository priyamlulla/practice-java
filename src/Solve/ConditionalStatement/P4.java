package Solve.ConditionalStatement;
//grade the student

public class P4 {
    public static void main(String[] args) {
        float mrk = 88.13f;

        if ( mrk >= 90){
            System.out.println(" you got grade A");
        } else if ( mrk<90 && mrk >= 80 ) {
            System.out.println(" you got grade B");
        } else if ( mrk<80 && mrk >= 65 ) {
            System.out.println(" you got grade B");
        }else
            System.out.println( " you failed");
    }
}
