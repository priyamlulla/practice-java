package Solve.Looping;

public class P14 {
    public static void main(String[] args) {
        String str = "aeiou";
        int counter = 0 ;
        for (char cr : str.toCharArray()){
            if((cr == 'a') || (cr == 'e') || (cr == 'i') || (cr == 'o') || (cr == 'u')){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
