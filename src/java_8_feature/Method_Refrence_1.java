package java_8_feature;
//method refer to a constructur of a class

@FunctionalInterface
interface sd{
    String stringStr (char [] ar);
}

public class Method_Refrence_1 {
    public static void main(String[] args) {
        sd ref = String::new;
        char [] cr = { 'a', 'b', 'c'};
        String s1 = ref.stringStr(cr);  // when i call method stringStr it refer to a constructor of Sting class-
                                        //-constructor that takes char [] as parameter , which is pre defined class and constructor
        System.out.println(s1);
    }
}
