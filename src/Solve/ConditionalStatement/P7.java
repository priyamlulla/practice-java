package Solve.ConditionalStatement;
//switch case day of week. 1 for monda

public class P7 {
    public static void main(String[] args) {
        int day = 0;
        if (day<1 || day>7){
            System.out.println("enter vaild input!");
            return;
        }

        switch (day) {
            case 1 :
                System.out.println(" its monday");
                break;

            case 2 :
                System.out.println(" its tuesday");
                break;

            case 3 :
                System.out.println(" its wednesday");
                break;

            case 4 :
                System.out.println(" its thursday");
                break;

            case 5 :
                System.out.println(" its friday");
                break;

            case 6 :
                System.out.println(" its saturday");
                break;

            default:
                System.out.println(" its sunday");
                break;
        }
    }
}
