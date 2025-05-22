package Basic;

//print all the subsequences of a string. using Basic.recursion
public class recursion10 {
    public static void sub (String sc, int idx,String newsc){

        if ( idx == sc.length()){
            System.out.println(newsc);
            return;
        }
        sub(sc,idx+1,newsc+sc.charAt(idx));
        sub(sc,idx+1,newsc+'_');
    }

    public static void main(String[] args) {
        String sc = "abc";
        sub(sc,0,"");
    }
}
