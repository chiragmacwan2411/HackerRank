package AnalogClock;

public class Solution {
    public static float AngleBetweenHands(String time){
        int hour = Integer.parseInt(time.split(":")[0]);
        int minute = Integer.parseInt(time.split(":")[1]);  // hour hand position
        float angle = 0;

        float hourHandJrny = 0F;
        float minuteHandJrny = 0F;
        float minHrHandsJrnyDiff = 0.08F;

        if (minute == 0){
            minuteHandJrny = 0;
            hourHandJrny = hour * 5;
        }
        else {
            minuteHandJrny = minute;
            for (int i = 0; i < hour; i++) {
                hourHandJrny = hourHandJrny + minHrHandsJrnyDiff;
            }
            hourHandJrny = (hourHandJrny + ((minute*5) / 60)) + (hour*5);
        }

        if (minuteHandJrny > hourHandJrny) {
            angle =  ((90 * (minuteHandJrny - hourHandJrny))/15);
        }
        else {
            angle =  ((90 * (hourHandJrny - minuteHandJrny))/15);
        }
        return angle;
    }
}