package solutions;

import static utils.DivisorsUtils.getSumOfDivisors;

import java.util.ArrayList;
import java.util.List;

public class Problem023 {

    public int solve() {
        int limit = 28123, sum = limit * (limit + 1) / 2;
        var canBeWrittenAsSumTwoAbundantNumbers = new boolean[limit + 1];
        var abundantNumbers = getAbundantNumbers(limit);
        for (int a : abundantNumbers) {
            for (int b : abundantNumbers) {
                int sumOfTwoAbundantNumbers = a + b;
                if (sumOfTwoAbundantNumbers >= canBeWrittenAsSumTwoAbundantNumbers.length) {
                    break;
                }
                if (!canBeWrittenAsSumTwoAbundantNumbers[sumOfTwoAbundantNumbers]) {
                    canBeWrittenAsSumTwoAbundantNumbers[sumOfTwoAbundantNumbers] = true;
                    sum -= sumOfTwoAbundantNumbers;
                }
            }
        }
        return sum;
    }

    private List<Integer> getAbundantNumbers(int limit) {
        List<Integer> abundantNumbers = new ArrayList<>();
        int[] sumOfDivisors = getSumOfDivisors(limit);
        for (int i = 2; i < sumOfDivisors.length; i++) {
            if (i < sumOfDivisors[i]) {
                abundantNumbers.add(i);
            }
        }
        return abundantNumbers;
    }
}
