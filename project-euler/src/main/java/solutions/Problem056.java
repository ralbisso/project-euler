package solutions;

import static utils.BigIntegerUtils.getSumOfDigits;

import java.math.BigInteger;

public class Problem056 {

    public int solve() {
        int max = 0;
        for (int a = 2; a < 100; a++) {
            for (int b = 2; b < 100; b++) {
                int sum = getSumOfDigits(BigInteger.valueOf(a).pow(b));
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
