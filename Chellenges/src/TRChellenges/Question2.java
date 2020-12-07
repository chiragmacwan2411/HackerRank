package TRChellenges;
//TR's Anagram Chellenge
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args){
        List<String> anagramString = new ArrayList<>();
        List<char[]> anagram = new ArrayList<>();

        String s0 = "chirag";
        String s1 = "garihc";
        String s2 = "arihcg";
        String s3 = "ihcgar";
        String s4 = "sarjana";
        String s5 = "arjanas";
        String s6 = "rjanasa";
        String s7 = "janasar";

        anagramString.add(s0);
        anagramString.add(s1);
        anagramString.add(s2);
        anagramString.add(s3);
        anagramString.add(s4);
        anagramString.add(s5);
        anagramString.add(s6);
        anagramString.add(s7);

        anagram.add(s0.toCharArray());
        anagram.add(s1.toCharArray());
        anagram.add(s2.toCharArray());
        anagram.add(s3.toCharArray());
        anagram.add(s4.toCharArray());
        anagram.add(s5.toCharArray());
        anagram.add(s6.toCharArray());
        anagram.add(s7.toCharArray());

        for (char[] anagramArray: anagram) {
            Arrays.sort(anagramArray);
        }

        List<Integer> indexes = new ArrayList<>();

        char[] comparer = anagram.get(0);
        for (int i = 1; i < anagram.size(); i++) {
            if (Arrays.equals(anagram.get(i), comparer)) {
                indexes.add(i);
            }
            else {
                comparer = anagram.get(i);
            }
        }
        for (int i = indexes.size()-1; i >= 0; i--) {
            anagramString.remove(anagramString.get(indexes.get(i)));
        }

        for (String s: anagramString) {
            System.out.println(s);
        }
    }
}