package com.ThomsonsReutersSampleFizzBuzzTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 & i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println("Buzz");
                }
            }
            else{
                    System.out.println(i);
                }
        }

    }
}
class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n = 15;
        FizzBuzz.fizzBuzz(n);

//        bufferedReader.close();
    }
}