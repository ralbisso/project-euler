package solutions;

import java.util.Arrays;

public class Problem043 {

    private final int[] constraints = { 2, 3, 5, 7, 11, 13, 17 };

    public long solve() {
        long sum = 0;
        int[] number = { 1, 0, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] last = new int[10];
        Arrays.fill(last, 9);
        int satisfiedConstraints = 0;
        while (!Arrays.equals(number, last)) {
            while (satisfiedConstraints < constraints.length) {
                while (!isConstraintSatisfied(number, satisfiedConstraints)) {
                    satisfiedConstraints = incrementNumber(number, satisfiedConstraints);
                }
                satisfiedConstraints++;
            }
            // if (is0To9Pandigital(number)) {
            System.out.println(Arrays.toString(number));
            // }
            satisfiedConstraints = incrementNumber(number, number.length - 1);
        }
        return sum;
    }

    private boolean isConstraintSatisfied(int[] number, int constraint) {
        int subnumber = getIntArrayToNumber(number, constraint + 1, constraint + 3);
        return constraint < 0 || subnumber % constraints[constraint] == 0;
    }

    private int getIntArrayToNumber(int[] array, int begin, int end) {
        if (begin < 0 || end > array.length) {
            return 0;
        }
        int number = 0;
        for (int i = begin; i <= end; i++) {
            number *= 10;
            number += array[i];
        }
        return number;
    }

    private long getIntArrayToNumber(int[] array) {
        long number = 0;
        for (int i = 0; i < array.length; i++) {
            number *= 10;
            number += array[i];
        }
        return number;
    }

    private int incrementNumber(int[] number, int index) {
        while (index > 0 && ++number[index] > 9) {
            number[index--] = 0;
        }
        return index;
    }
}
