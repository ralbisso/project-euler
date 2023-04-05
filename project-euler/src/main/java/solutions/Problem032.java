package solutions;

import static utils.PermutationUtils.nextPermutation;

import java.util.HashSet;

public class Problem032 {

    public int solve() {
        int sum = 0;
        int[] pandigital = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        var products = new HashSet<>();
        while (nextPermutation(pandigital)) {
            int[] case1x4 = getProduct(pandigital, 1, 4);
            int[] case2x3 = getProduct(pandigital, 2, 3);
            int product = case1x4[2];
            if ((isValidProduct(case1x4) || isValidProduct(case2x3)) && products.add(product)) {
                sum += product;
            }
        }
        return sum;
    }

    private int[] getProduct(int[] pandigital, int multiplicandSize, int multiplierSize) {
        int index = 0;
        int multiplicand = getOperand(pandigital, index, multiplicandSize);
        index += multiplicandSize;
        int multiplier = getOperand(pandigital, index, multiplierSize);
        index += multiplierSize;
        int product = getOperand(pandigital, index, 4);
        return new int[] { multiplicand, multiplier, product };
    }

    private int getOperand(int[] pandigital, int index, int size) {
        int operand = 0, pow = (int) Math.pow(10, size - 1);
        for (int i = index; i < index + size; i++) {
            operand += pandigital[i] * pow;
            pow /= 10;
        }
        return operand;
    }

    private boolean isValidProduct(int[] product) {
        return product[0] * product[1] == product[2];
    }
}
