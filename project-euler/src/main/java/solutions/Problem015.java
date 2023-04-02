package solutions;

import static utils.BigIntegerUtils.getBinomialCoefficient;

public class Problem015 {

    public long solve() {
        // Number of routes in an n x n grid is: C(2n, n)
        return getBinomialCoefficient(2 * 20, 20).longValue();
    }
}
