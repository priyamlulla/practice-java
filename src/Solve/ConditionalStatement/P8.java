package Solve.ConditionalStatement;
// print all prime no  between 1 to 100

public class P8 {
    public static void main(String[] args) {
        int count = 0;

        for ( int i = 1 ; i <= 100 ; i++){
            for(int j = 1; j <= 100 ; j++){
                if ( i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
            count = 0;
        }

    }
}
