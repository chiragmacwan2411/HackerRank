package SalesByMatch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int numOfPairs = 0;
        List<Integer> numOfSocksInEachColor = new ArrayList();
        int currentColor = ar[0];
        int numOfcurrentsocks = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] == currentColor) {
                numOfcurrentsocks++;
            }
            else {
                currentColor = ar[i];
                numOfSocksInEachColor.add(numOfcurrentsocks);
                numOfcurrentsocks = 1;
            }
        }
        numOfSocksInEachColor.add(numOfcurrentsocks);
        for (int pairs : numOfSocksInEachColor) {
            if (pairs != 1) {
                numOfPairs = numOfPairs + (pairs / 2);
            }
        }
        return numOfPairs;
    }
}