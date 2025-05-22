package Basic;

//check if array is sorted or not (note : strictly increasing) using Basic.recursion
public class recursion7 {
    public static int  check(int sc[],int idx){
        if(idx==sc.length-1){
            return 1;
        }
        if (sc[idx]<sc[idx+1]){
           return check(sc,idx+1) ;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int [] sc = {0,1,2,3,4,5,6,7,8,9};
        int a = check(sc,0);
        if(a==1){
            System.out.println("String is strictly sorted");
        }else{
            System.out.println("String is not strictly sorted");
        }
    }
}
