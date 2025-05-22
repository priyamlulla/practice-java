package Basic;

//print all permutation of a string by backtracking
public class backTracking1 {
    public static void print (String str,String newstr,int idx){
        if (str.length()==0){
            System.out.println(newstr);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char cr = str.charAt(i);
            String newsc = str.substring(0,i)+str.substring(i+1);
            print(newsc, newstr+cr, idx + 1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        print (str,"",0);
    }
}
