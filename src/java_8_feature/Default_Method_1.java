package java_8_feature;
//Java Default Methods in Interface

interface w1 {
    void m();

    default void m1() {
        System.out.println("in m1");
    }
}

class w implements w1 {
    @Override
    public void m() {
        //class A needs to over ride only m not m1 ;
        //we can over ride m1 but its is now not necessary
    }
}

class w2 implements w1 {
    @Override
    public void m() {
        //compulsury to over ride
    }

    public void m1() {
        //not compulsury but this is how we can overide default methods
    }
}


interface eg1 {
    default void M1() {
        // some code
    }
}

interface eg2 {
    default void M1() {
        //some different code
    }
}

class eg implements eg1, eg2 {
    //now if i over ride M1 here there is ambiquity then we solve that by doing the following
    public void M1() {
        eg1.super.M1();
        eg2.super.M1();
    }
}


public class Default_Method_1 {
    public static void main(String[] args) {
        /* syntax : default return_type method_name ( parameters ) {
                            statement/s             //only allow public asscess specifier
                    }   */
    }


}
