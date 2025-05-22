package Basic;

//three basic types of Basic.sorting
public class sorting {
    public static void main(String[] args) {
        int[] a = {7, 4, 8, 1, 3, 8};
        int i = 0, j = 0;
        int n = n = a.length;
        //bubble sort
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //selection sort
        int[] b = {1, 3, 4, 7, 1, 9, 67};
        int m = b.length;
        for (i = 0; i < m ; i++) {
            int sml = i;
            for (j = i + 1; j < m ; j++) {
                if (b[sml] > b[j]) {
                    sml = j;
                }
            }
            int temp = b[sml];
            b[sml]=b[i];
            b[i]=temp;
        }
        for (i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        //insertion Basic.sorting
        int [] c={6,8,6,4,0,1,98};
        int k = c.length;
        for( i=1; i<c.length; i++) {
            int arrow = c[i];
             j = i - 1;
            while(j >= 0 && c[j] > arrow) {
                //Keep swapping
                c[j+1] = c[j];
                j--;
            }
            c[j+1] = arrow;
        }
        for (i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
