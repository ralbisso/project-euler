package solutions;

import static utils.NumberUtils.isPermutation;
import static utils.PrimeUtils.getEulerTotients;

public class Problem070 {

    public int solve() {
        int min = 0;
        double minRatio = Double.MAX_VALUE;
        int[] eulerTotients = getEulerTotients(10000000);
        for (int i = 2; i < eulerTotients.length; i++) {
            double ratio = (double) i / (double) eulerTotients[i];
            if (ratio < minRatio && isPermutation(i, eulerTotients[i])) {
                minRatio = ratio;
                min = i;
            }
        }
        return min;
    }
}
