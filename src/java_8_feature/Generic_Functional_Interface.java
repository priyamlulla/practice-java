package java_8_feature;

@FunctionalInterface
interface GenericFunctionalInterface<A> {
    A Met(A o);
}
public class Generic_Functional_Interface {
    public static void main(String[] args) {
        GenericFunctionalInterface <Integer> factorial = (n) -> {
            int fac = 1;
            for (int i =1 ; i <= n ; i ++){
                fac = fac * i ;
            }
            return fac;
        };
        int sav = factorial.Met(new Integer (5) );
        System.out.println(sav);

        GenericFunctionalInterface <String> reverseStr = (s) ->{
            String str = "";
            for (int i = s.length()-1 ; i >= 0 ; i-- ){
                str=str + s.charAt(i);
            }
            return str;
        };
        System.out.println(reverseStr.Met(new String("java")));
    }
}
