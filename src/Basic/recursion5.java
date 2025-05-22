package Basic;

//print a string in reverse using Basic.recursion
public class recursion5 {
    public static void revstr (String sc,int idx ){
        if (idx==0){
            System.out.print(sc.charAt(0));
            return;
        }
        System.out.print(sc.charAt(idx));
        revstr(sc,idx-1);
    }
    public static void main(String[] args) {
      String sc = "abcd  1234" ;
      revstr(sc,sc.length()-1);
    }
}
