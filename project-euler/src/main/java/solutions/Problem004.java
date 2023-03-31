package solutions;

import static utils.NumberUtils.isPalindromic;

public class Problem004 {

    public int solve() {
        int max = 0;
        for (int n = 998; n > 100; n--) {
            for (int m = n + 1; m < 1000; m++) {
                int product = n * m;
                if (product > max && isPalindromic(product)) {
                    max = product;
                }
            }
        }
        return max;
    }
}
