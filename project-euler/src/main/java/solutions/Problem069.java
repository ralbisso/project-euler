package solutions;

import static utils.PrimeUtils.getEulerTotients;

public class Problem069 {

    public int solve() {
        int max = 0;
        double maxRatio = 1.0;
        int[] eulerTotients = getEulerTotients(1000000);
        for (int i = 2; i < eulerTotients.length; i++) {
            double ratio = (double) i / (double) eulerTotients[i];
            if (ratio > maxRatio) {
                maxRatio = ratio;
                max = i;
            }
        }
        return max;
    }
}
