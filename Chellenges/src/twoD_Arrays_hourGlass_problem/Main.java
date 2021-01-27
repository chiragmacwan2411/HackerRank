package twoD_Arrays_hourGlass_problem;

// the challenge can be found at the following url
// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class Main {
    public static void main(String[] args){
        int[][] arr = {{-9,-9,-9, 1,1,1},
                       { 0,-9, 0, 4,3,2},
                       {-9,-9,-9, 1,2,3},
                       { 0, 0, 8, 6,6,0},
                       { 0, 0, 0,-2,0,0},
                       { 0, 0, 1, 2,4,0}};
        Solution.hourglassSum(arr);
    }
}
