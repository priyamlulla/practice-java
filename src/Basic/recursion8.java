package Basic;

//move all the x to the end of the string using Basic.recursion time complexity O(n)
public class recursion8 {
    public static String newsc="";
     public static String move (String sc,int co,int idx){
        if (idx==sc.length()){
            for(int i =1; i<=co;i++){
                newsc = newsc + 'x';
            }
            return newsc;
        }
        if(sc.charAt(idx)!='x'){
            newsc=newsc+sc.charAt(idx);
        }
        else{
            co++;
        }
        return move (sc, co,idx+1);
    }
    public static void main(String[] args) {
        String sc = "axxxrh";
        int co=0,idx=0;
        String s = move (sc,co,idx);
        System.out.println(s);
    }
}
