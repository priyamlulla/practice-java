package java_8_feature;
//method refrence to an instane methode of an arbitrary tupe

@FunctionalInterface
interface Trifunction < T , U , V , R >{
    R apply ( T t , U u , V v );
}
class Sum {
    Integer doSum ( String s1 , String s2 ){
        return ( Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}
public class Method_Refrence_2 {
}
