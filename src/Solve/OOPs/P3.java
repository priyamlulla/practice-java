package Solve.OOPs;

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int roll_no;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }


}
public class P3 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Priyam");
        obj.setRoll_no(30);
        System.out.println(obj.getName());
        System.out.println(obj.getRoll_no());
    }
}
