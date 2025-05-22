package Basic;

//find max and min in a array
public class javaarray3 {
    public static void main(String[] args) {
        int [] a = {1,-56,0,96,45,34,234};
        int max =a [0], min = a[0];

        for(int i =0; i<a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("max in array is :" + max);
        System.out.println("min in array is :"+ min);
    }
}
