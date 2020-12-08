package JumpingOnTheClouds;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int jumpingOnClouds(int[] clouds){
        //0010010
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < clouds.length; i++) {
            if (clouds[i] == 0) {
                path.add(i);
            }
        }

        List<Integer> shortestPath = new ArrayList<>();
        shortestPath.add(path.get(0));
        for (int i = 1; i < path.size()-1; i++) {
            if (path.get(i+1) == path.get(i) + 1 ){
                shortestPath.add(path.get(i+1));
            }
            else {shortestPath.add(path.get(i));}
        }
        shortestPath.add(path.get(path.size()-1));
        return 0;
    }
}