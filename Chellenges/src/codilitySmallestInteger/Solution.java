package codilitySmallestInteger;
import java.util.Arrays;

public class Solution {
    public static int solution(int[] a){
        Arrays.sort(a);
        int smallestInt = 0;
        int comparer = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != comparer){
                if ((a[i] - 1) != comparer){
                    smallestInt = a[i] - 1;
                    break;
                }
            }
            comparer = a[i];
        }
        if (smallestInt == 0){
            smallestInt = a[a.length-1] + 1;
        }
        else if (smallestInt < 0) {
            smallestInt = 1;
        }
        return smallestInt;
    }
}