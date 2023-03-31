package solutions;

import static utils.NumberUtils.getSumOfDigits;

import java.math.BigInteger;

public class Problem056 {

    public int solve() {
        int max = 0;
        for (int a = 2; a < 100; a++) {
            for (int b = 2; b < 100; b++) {
                BigInteger big = BigInteger.valueOf(a).pow(b);
                int sum = getSumOfDigits(big.toString());
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
