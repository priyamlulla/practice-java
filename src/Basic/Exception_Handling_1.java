package Basic;
//  WAP in java to demostrate syntax , logical , run time error

public class Exception_Handling_1 {
    public static void main(String[] args) {

       //  int a = 6        //  without ; is s syntax error
       // System.out.Println();    // in println it should be small isa syntax error

        //print 0 to 5
        for ( int i = 0 ; i < 5 ; i++){
            System.out.println(i);   // is logical bcasue out is 0 1 2 3 4  , insted we want 0 to  5
        }

        int d = 5;
        int b = 0;
        int db= d/b;
        System.out.println(db);//  is a run time error
    }
}
