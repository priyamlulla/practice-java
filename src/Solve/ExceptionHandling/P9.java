package Solve.ExceptionHandling;

import java.io.IOException;

class my {
    void thr () throws IOException{
        //some code
        throw new IOException();
    }
}
public class P9 {
    public static void main(String[] args) {
        my m = new my ();

        try {
            m.thr();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
