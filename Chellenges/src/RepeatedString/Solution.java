package RepeatedString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static long repeatedString(String s, long n) {
        long numberOfa = 0;
        String RegExPattern = "a";
        Pattern pattern = Pattern.compile(RegExPattern);
        Matcher matcher = pattern.matcher(s);

        long repetation =  n / s.length();
        long remainder =  n % s.length() ;

        while (matcher.find()) {
            numberOfa ++;
        }
        long numberOfaInRepetition = numberOfa * repetation;

        if (remainder != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < remainder; i++) {
                sb.append(s.toCharArray()[i]);
            }
            Matcher remainderMatcher = pattern.matcher(sb.toString());
            while (remainderMatcher.find()){
                numberOfaInRepetition++;
            }
        }
        return  numberOfaInRepetition;
    }
}