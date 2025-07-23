package GFG;

import java.util.Comparator;
import java.util.Scanner;
public class P7 {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int index;
        while(true){
            if(d<n){
                d=d + 7;
            }else{
                index = d-n;
                break;
            }
        }
        return index;
    }
}
