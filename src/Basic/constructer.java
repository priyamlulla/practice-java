package Basic;

import java.util.Scanner;

//to add two no using Basic.constructer
class process{
    private int a,b,ad;
    public void display(){
        System.out.println("addition = " + ad);
    }
    public void add(){
         ad = a+b;
    }
    process(int a,int b){
        this.a = a;
        this.b=b;
    }
}
public class constructer {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two no to add here :");
        a = sc.nextInt();
        b=sc.nextInt();
        process obj = new process(a,b);
        obj.add();
        obj.display();
    }
}
