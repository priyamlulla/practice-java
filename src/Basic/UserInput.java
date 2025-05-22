package Basic;

import java.io.BufferedReader;
import java.io.IOException;//for system.in.read statement
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {//here ioexception used because of System.in.read(); statement
        System.out.println("enter a no.");//print out put
        int num = System.in.read();//this throws ioexception //this stores ascii values of number// takes only one char

        //feature used in java 1.5
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);//it is a resource
        System.out.println("enter a no.");//print out put
        int n = Integer.parseInt( bf.readLine());

        System.out.println(num + " " + n);
        bf.close();//because it is a resource


        Scanner sc = new Scanner(System.in);
        sc.nextInt();
    }
}
