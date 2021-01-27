package twoD_Arrays_hourGlass_problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int hourglassSum(int[][] arr) {
        int result = -2147483648; // last negative int
        int[][] hourGlassSums = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hourGlassSums[i][j] = (arr[i][j] + arr[i][j +1] + arr[i][j+2]) +
                                      (arr[i+1][j+1]) +
                                      (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
            }
        }
        for (int[] glass : hourGlassSums) {
            result = glass[0];
            for (int g :  glass){
                if (g > result){
                    result = g;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
