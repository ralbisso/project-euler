package solutions;

import static utils.NumberUtils.isPalindromic;

public class Problem004 {

    public int solve() {
        int max = 0, limit = 1000;
        for (int n = 100; n < limit; n++) {
            for (int m = n + 1; m < limit; m++) {
                int product = n * m;
                if (product > max && isPalindromic(product)) {
                    max = product;
                }
            }
        }
        return max;
    }
}
