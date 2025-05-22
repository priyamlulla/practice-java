package Basic;

import java.util.*;
public class hrivb {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks of every subject mentioned one by one!");

        System.out.println("physics");
        int phy=sc.nextInt();
        System.out.println("physics% =" + phy + "%");

        System.out.println("maths");
        int mat=sc.nextInt();
        System.out.println("maths% =" + mat + "%");

        System.out.println("chemistry");
        int che=sc.nextInt();
        System.out.println("chemistry% =" + che + "%");

        System.out.println("english");
        int eng=sc.nextInt();
        System.out.println("english% =" + eng + "%");

        System.out.println("biology");
        int bio=sc.nextInt();
        System.out.println("biology% =" + bio + "%");

        int tot=(phy+che+bio+eng+mat);
        System.out.println("total marks =" + tot + "/500");
        System.out.println("totoal percentage =" + tot/5 + "%");
    }
}
