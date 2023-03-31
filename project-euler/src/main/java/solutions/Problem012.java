package solutions;

import static utils.FactorizationUtils.getNumberOfDivisors;

public class Problem012 {

    public int solve() {
        int triangle = 1, number = 1, numberOfDivisors = 1;
        while (numberOfDivisors < 500) {
            triangle += ++number;
            numberOfDivisors = getNumberOfDivisors(triangle);
        }
        return triangle;
    }
}
