package Solve.OOPs;

class Employe implements Cloneable{
    private int sallary;
    private String name;

    Employe(String name , int sallary){
        this.name=name;
        this.sallary=sallary;
    }

    public String getName() {
        return name;
    }

    public int getSallary() {
        return sallary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class P30 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employe emp1 = new Employe("Priyam",20000);
        Employe emp2 = (Employe) emp1.clone();

        System.out.println(emp1.getName() + " " + emp1.getSallary() + " " + emp2.getName() + " " + emp2.getSallary());

    }
}
