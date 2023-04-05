package solutions;

import static utils.DivisorsUtils.getSumOfDivisors;

public class Problem021 {

    public int solve() {
        var sumOfDivisors = getSumOfDivisors(10000);
        int sum = 0, length = sumOfDivisors.length;
        for (int i = 2; i < length; i++) {
            // da and db are the sum of proper divisors of a and b
            int a = i, da = sumOfDivisors[a], b = da;
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
