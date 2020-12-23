package topTal1;

import java.util.List;

public class Result {
    public static int maxStreak(int m, List<String> data) {
        // Write your code here
        int maxStreak = 0;
        for (String d: data) {
            boolean allPresent = true;
            for (int i = 0; i < d.toCharArray().length; i++) {
                if (d.toCharArray()[i] == 'N'){
                    allPresent = false;
                }
            }
            if (allPresent == true){
                maxStreak++;
            }
        }
        return maxStreak;
    }
}
