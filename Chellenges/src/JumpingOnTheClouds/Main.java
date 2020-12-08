package JumpingOnTheClouds;

import java.util.ArrayList;
import java.util.List;

//PROBLEM STATEMENT AT BELOW URL:
//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
public class Main {
    public static void main(String[] args){
        int[] clouds = {0,0,1,0,0,1,0};
//        int[] clouds = {0,0};
        System.out.println(Solution.jumpingOnClouds(clouds));
    }
}
