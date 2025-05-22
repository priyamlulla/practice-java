package Basic;

//print all possible combination of a string
public class recursion13 {

    public static void check(String sc,String per){
        if (sc.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<sc.length();i++){
            char currchar = sc.charAt(i);
            String newsc = sc.substring(0,i)+ sc.substring(i+1);
            check(newsc,per+currchar);
        }
    }
    public static void main(String[] args) {
        String sc = "abc";
        check(sc,"");
    }
}
