package leftRotatingArray;

import java.util.Arrays;

public class Solution {
    public static int[] rotLeft(int[] a, int d) {
        if (d % a.length == 0){
            return a;
        }
        else if (d % a.length == d) {
            int[] x = Arrays.copyOfRange(a, 0, d);
            int[] y = Arrays.copyOfRange(a, d, a.length);

            for (int num: x) {
                System.out.println(num);
            }

            for (int num: y) {
                System.out.println(num);
            }
            a = new int[y.length + x.length];
            System.arraycopy(y,0,a,0,y.length);
            System.arraycopy(x,0,a,y.length,x.length);
//            System.out.println(Arrays.toString(a));
        }
        else {
            int[] helper = new int[a.length];
            int rotations = d % a.length;


            for (int i = 0; i < rotations; i++) {
                for (int j = a.length-2; j >= 0 ; j--) {
                    helper[j] = a[j+1];
                }
                helper[a.length-1] = a[0];
                a = helper;
                helper = new int[a.length];
            }
        }
        return a;
    }
}
