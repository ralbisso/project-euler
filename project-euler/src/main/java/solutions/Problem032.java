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
        int lowerMultiplicand = multiplicandSize == 1 ? 1 : 10;
        int upperMultiplicand = multiplicandSize == 1 ? 9 : 99;
        int lowerMultiplier = multiplierSize == 3 ? 100 : 1000;
        int upperMultiplier = multiplierSize == 3 ? 999 : 9999;
        int offset = multiplierSize == 3 ? 1000 : 10000;
        for (int multiplicand = lowerMultiplicand; multiplicand <= upperMultiplicand; multiplicand++) {
            for (int multiplier = lowerMultiplier; multiplier <= upperMultiplier; multiplier++) {
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
}
