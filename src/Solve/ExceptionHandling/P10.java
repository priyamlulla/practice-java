package Solve.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        try(BufferedReader r = new BufferedReader (i)) {
            int res = Integer.parseInt(r.readLine());
        }
        //it will autimatically close resourse because its extends autocloseable
    }
}
