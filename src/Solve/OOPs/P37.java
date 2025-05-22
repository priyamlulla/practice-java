package Solve.OOPs;

class Employ {
    void show(){
        System.out.println("in Employ");
    }
}

class Managerr extends Employ{
    void give(){
        System.out.println("in Managerr");
    }
}

public class P37 {
    public static void main(String[] args) {
        Employ a =(Managerr) new Managerr();
        a.show();

        Managerr b =(Managerr)  a ;
        b.give();
    }
}
