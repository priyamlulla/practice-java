package Basic;

//find first and last occurance of a char in a string
public class recursion6 {
    public static int first = -1;
    public static int last = -1;
    public static void check(String sc, int idx, char n){
        if (idx==sc.length()){
            System.out.println(first + " " + last);
            return;
        }
        char currcar = sc.charAt(idx);
        if ( n==currcar){
            if (first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }
        }
        check(sc,idx+1,n);
    }
    public static void main(String[] args) {
        String sc = "abaafgrfaafta";
        check(sc,0,'a');
    }
}
