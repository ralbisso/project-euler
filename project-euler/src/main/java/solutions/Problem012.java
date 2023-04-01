package solutions;

import static utils.FactorizationUtils.getNumberOfDivisors;

public class Problem012 {

    public int solve() {
        int triangle = 1, increment = 1, numberOfDivisors = 1;
        while (numberOfDivisors < 500) {
            triangle += ++increment;
            numberOfDivisors = getNumberOfDivisors(triangle);
        }
        return triangle;
    }
}
