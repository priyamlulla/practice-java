package java_8_feature;

@FunctionalInterface
interface ifg {
    void apply(String a);
}
class My {
    void convertToLowerCase (String b){
        String str = "";
        for ( int i = 0;i<b.length();i++ ){
            char ch = b.charAt(i);
            if (ch>= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            }
            str = str + ch ;
        }
        System.out.println(str);
    }
}

@FunctionalInterface
interface i {
     void sa();
}
class so{
    static void soo(){
        //some code
        System.out.println("in so class in static method soo called by sa interface");
    }
}
public class Method_Refrence {
    public static void main(String[] args) {
        //My m = new My();
       // ifg j = m::convertToLowerCase;  // this type of method name is called as instance method refrence
       // j.apply("JaVA");              // and aslso called as non-static class refrence
      //  /* this is without using method reference for non-static method
            ifg j = (Z)-> {
                My m = new My();
                m.convertToLowerCase("PRIYAM");
            };
     //    */

        i io = so::soo;  //this is for static method refrence
        io.sa();
    }
}
