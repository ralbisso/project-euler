package solutions;

import java.util.LinkedList;

public class Problem040 {

    public int solve() {
        int product = 1, power = 1, digit = 1, number = 1;
        LinkedList<Integer> constant = new LinkedList<>();
        for (int i = 1; i < 1000000; i++) {
            if (i % power == 0) {
                product *= digit;
                power *= 10;
            }
            if (constant.isEmpty()) {
                number = feedConstant(constant, number);
            }
            digit = constant.removeFirst();
        }
        return product;
    }

    private int feedConstant(LinkedList<Integer> constant, int number) {
        int addToConstant = ++number;
        while (addToConstant > 0) {
            constant.addFirst(addToConstant % 10);
            addToConstant /= 10;
        }
        return number;
    }
}
