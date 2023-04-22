package solutions;

import static utils.DivisorsUtils.getSumOfDivisors;

public class Problem021 {

    public int solve() {
        var sumOfDivisors = getSumOfDivisors(10000);
        int sum = 0, length = sumOfDivisors.length;
        for (int a = 2; a < length; a++) {
            int da = sumOfDivisors[a], b = da;
            if (a < b && b < length) {
                int db = sumOfDivisors[b];
                if (isAmicablePair(a, da, b, db)) {
                    sum += a + b;
                }
            }
        }
        return sum;
    }

    private boolean isAmicablePair(int a, int da, int b, int db) {
        return da == b && db == a;
    }
}
