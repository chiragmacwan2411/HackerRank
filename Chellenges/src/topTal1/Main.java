package topTal1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int emplolyees = 3;
        int numOfDays = 5;
        List<String> data = new ArrayList<>();
        String[] data_arr = {"YYY","YYY", "YNN", "YYN", "YYN"};
        for (String att: data_arr) {
            data.add(att);
        }
        System.out.println(Result.maxStreak(emplolyees, data));
    }
}
