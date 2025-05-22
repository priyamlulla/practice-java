package Solve.OOPs;

final class Studentt {
    private String name;
    private int rollNo;

    Studentt(String name , int rollNo){
        this.rollNo=rollNo;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
}
public class P18 {
    public static void main(String[] args) {
        Studentt st = new Studentt("Priyam" , 30);
        System.out.println(st.getName());
        System.out.println(st.getRollNo());
    }
}
