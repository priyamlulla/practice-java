package Basic;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'b';
        char c = (char) (a + b);
        System.out.println(performOpertion(a, b, "add"));
    }

    public static String performOpertion(int value1, char value2, String operation) {
        if (operation.equalsIgnoreCase("add")) {
            return String.valueOf(value1 + value2);
        }
        return "Invalid Operation";
    }

}