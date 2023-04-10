package solutions;

import static utils.FactorizationUtils.getNumberOfDivisors;

public class Problem012 {

    public int solve() {
        int triangle = 1, increment = 1;
        while (getNumberOfDivisors(triangle) < 500) {
            triangle += ++increment;
        }
        return triangle;
    }
}
