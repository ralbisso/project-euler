package solutions;

import static utils.NumberUtils.is1To9Pandigital;

import java.util.HashSet;
import java.util.Set;

public class Problem032 {

    public int solve() {
        int sum = 0;
        Set<Integer> products = new HashSet<>();
        sum += getCase(products, 1, 4); // Case 1 digit x 4 digits = 4 digits
        sum += getCase(products, 2, 3); // Case 2 digits x 3 digits = 4 digits
        return sum;
    }

    private int getCase(Set<Integer> products, int multiplicandSize, int multiplierSize) {
        int sum = 0;
        int[] multiplicandBounds = getBounds(multiplicandSize);
        int[] multiplierBounds = getBounds(multiplierSize);
        int offset = multiplierBounds[0] * 10;
        for (int multiplicand = multiplicandBounds[0]; multiplicand <= multiplicandBounds[1]; multiplicand++) {
            for (int multiplier = multiplierBounds[0]; multiplier <= multiplierBounds[1]; multiplier++) {
                int product = multiplicand * multiplier;
                if (product <= 9999) {
                    int operation = multiplicand * offset + multiplier;
                    operation = operation * 10000 + product;
                    if (is1To9Pandigital(operation) && products.add(product)) {
                        sum += product;
                    }
                }
            }
        }
        return sum;
    }

    private int[] getBounds(int size) {
        int lower = (int) Math.pow(10, size - 1);
        int upper = lower * 10 - 1;
        return new int[] { lower, upper };
    }
}
