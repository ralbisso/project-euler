package solutions;

import java.util.Stack;

public class Problem040 {

    public int solve() {
        int product = 1, power = 1, digit = 1, number = 1, limit = 1000000;
        Stack<Integer> constant = new Stack<>();
        for (int i = 1; i < limit; i++) {
            if (i % power == 0) {
                product *= digit;
                power *= 10;
            }
            if (constant.isEmpty()) {
                feedConstant(constant, ++number);
            }
            digit = constant.pop();
        }
        return product;
    }

    private void feedConstant(Stack<Integer> constant, int number) {
        int addToConstant = number;
        while (addToConstant > 0) {
            constant.push(addToConstant % 10);
            addToConstant /= 10;
        }
    }
}
