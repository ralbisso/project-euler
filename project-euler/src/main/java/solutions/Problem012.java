package solutions;

import static utils.FactorizationUtils.getNumberOfDivisors;

public class Problem012 {

    public int solve() {
        int n = 1, triangle = 1;
        while (getNumberOfDivisors(triangle) < 500) {
            n++;
            triangle = n * (n + 1) / 2;
        }
        return triangle;
    }
}
