package Basic;

//remove all extra alphabet in astring using Basic.recursion
public class recursion9 {
    public static boolean [] a = new boolean[26];
    public static void remove (String sc,int idx,String newsc){
        if(idx == sc.length()){
            System.out.println(newsc);
            return;
        }
        char currChar = sc.charAt(idx);
        if (a[currChar-'a']==true){
            remove(sc,idx+1,newsc);
        }else{
            newsc+=currChar;
            a[currChar-'a']=true;
            remove(sc,idx+1,newsc);
        }
    }

    public static void main(String[] args) {
        String sc = "aabbcchgi";
        remove (sc,0,"");
    }
}
