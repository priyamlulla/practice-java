package Basic;

public class Advance_Loop_1 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1 ; i<=5 ; i++){
            for(j=1; j<=5; j++){
                if(j==1||j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(k=5; k>=1; k--) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
        for(i=5 ; i>=1 ; i--){
            for(j=1; j<=5; j++){
                if(j==1||j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(k=5; k>=1; k--) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}

