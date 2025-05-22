package Basic;

public class javaarray1 {
    public static void main(String[] args) {
        float [] a = {1.1f,2.2f,3.3f,4.4f,5.5f,};
        float s=0;
        int l=a.length;
        for(int i=0; i<l;i++){
            s = s + a[i];
        }
        System.out.println(s);
    }
}
