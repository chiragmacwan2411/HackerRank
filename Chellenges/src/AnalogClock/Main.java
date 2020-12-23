package AnalogClock;

// Problem : Given time (String) in an Analogue clock, find the angle between minute and hour hand
public class Main {
    public static void main(String[] args){
        String Time = "9:00";
        float res_angle = Solution.AngleBetweenHands(Time);
        System.out.printf("%.2f", res_angle );
        System.out.printf("\nThe other side angle is : " + (360 - res_angle));
    }
}
