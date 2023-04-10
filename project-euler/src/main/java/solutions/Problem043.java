package solutions;

import static utils.NumberUtils.is0To9Pandigital;

public class Problem043 {

    private final int[] constraints = { 2, 3, 5, 7, 11, 13, 17 };

    public long solve() {
        long sum = 0;
        int[] number = new int[10];
        number[0] = 1;
        int index = 0;
        while (number[0] > 0) {
            while (index < constraints.length) {
                while (!isConstraintSatisfied(number, index)) {
                    index = incrementNumber(number, index + 3);
                }
                index++;
            }
            if (is0To9Pandigital(number)) {
                sum += concatenateNumber(number);
            }
            index = incrementNumber(number, number.length - 1);
        }
        return sum;
    }

    private long concatenateNumber(int[] array) {
        return concatenateNumber(array, 0, array.length);
    }

    private long concatenateNumber(int[] array, int begin, int end) {
        long number = 0;
        for (int i = Math.max(0, begin); i < Math.min(end, array.length); i++) {
            number *= 10;
            number += array[i];
        }
        return number;
    }

    private int incrementNumber(int[] number, int index) {
        while (index >= 0 && ++number[index] > 9) {
            number[index--] = 0;
        }
        return Math.max(0, index - 3);
    }

    private boolean isConstraintSatisfied(int[] number, int index) {
        int subNumber = (int) concatenateNumber(number, index + 1, index + 4);
        return subNumber > 0 && subNumber % constraints[index] == 0;
    }
}
