package JumpingOnTheClouds;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int jumpingOnClouds(int[] clouds){
        //0100010
        List<Integer> cloudsPathShort = new ArrayList();
        if (clouds.length == 2){
            return clouds.length - 1;
        }
//        System.out.println(cloudsPath);
        int dynamic_i = 0;
        for (int i = 0; i < clouds.length - 2; i++) {
            if (i == dynamic_i) {
                if (i == 0) {
                    cloudsPathShort.add(i);
                }
                if (clouds[i] != 1){
                    int shortJumpCloud = clouds[i+1];
                    int longJumpCloud = clouds[i+2];
                    if ( ((shortJumpCloud == 0) & (longJumpCloud == 0)) || ((shortJumpCloud == 1) & (longJumpCloud == 0)) ){
                        cloudsPathShort.add(i+2);
                        dynamic_i = i + 2;
                    }
                    else if ((shortJumpCloud == 0) & (longJumpCloud == 1)) {
                        cloudsPathShort.add(i+1);
                        dynamic_i = i + 1;
                    }
                }
            }
        }
        if ((clouds.length-1) != (cloudsPathShort.get(cloudsPathShort.size()-1))){
            cloudsPathShort.add(clouds.length);
        }
        System.out.println(cloudsPathShort);
        return cloudsPathShort.size() - 1;
    }
}