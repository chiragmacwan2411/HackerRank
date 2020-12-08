package CountingValleys;

public class Result {
    public static int countingValleys(int steps, String path) {
        int Valley = 0;
//        int Mountain = 0;
        double StepUp = 0;
        double StepDown = 0;
//        boolean seaLevel = true;
        String Steps = path;
        for (char step : Steps.toCharArray()) {
            if (step == 'U') {
                StepUp++;
            } else {
                StepDown++;
            }
//            seaLevel = false;
            if (StepUp == StepDown) {
//                seaLevel = true;
                if (step == 'U') {
                    Valley++;
                }
//                } else {
//                    Mountain++;
//                }
            }
        }
        return Valley;
    }
}
