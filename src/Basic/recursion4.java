package Basic;

//hanoi problem
public class recursion4 {
    public static void calc(int n , String scr, String help,String des){
        if(n==1){
            System.out.println("transfer disk " + n + " from "+ scr + " to "+ des);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        calc(n-1,scr,des,help);

        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + scr + " to " + help);

        //transfer n-1 from helper to dest using src as 'helper'
        calc(n-1, help,scr, des);
    }
    public static void main(String[] args) {
        int n=3;
        calc(n,"A","B","C");
    }
}
