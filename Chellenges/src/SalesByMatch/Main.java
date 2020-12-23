package SalesByMatch;
// Problem statement at below url
// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class Main {
    public static void main(String[] args){
        int numOfSocks = 9;
        int[] socksInPile = {10,20,20,10,10,30,50,10,20};
        System.out.println(Solution.sockMerchant(numOfSocks, socksInPile));
    }
}
