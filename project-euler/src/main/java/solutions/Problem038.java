package solutions;

import static utils.NumberUtils.getSize;
import static utils.NumberUtils.is1To9Pandigital;

public class Problem038 {

    public int solve() {
        int max = 0;
        for (int i = 1; i < 10000; i++) {
            int concatenated = i, multiples = i;
            while (concatenated < 100000000) {
                multiples += i;
                int size = getSize(multiples);
                concatenated *= (int) Math.pow(10, size);
                concatenated += multiples;
            }
            if (concatenated > max && is1To9Pandigital(concatenated)) {
                max = concatenated;
            }
        }
        return max;
    }
}
