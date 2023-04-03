package solutions;

import static utils.DivisorsUtils.getSumOfDivisors;

import java.util.ArrayList;
import java.util.List;

public class Problem023 {

    public int solve() {
        int sum = 0;
        boolean[] canBeWrittenAsSumTwoAbundantNumbers = 
                getNumbersThatCanBeWrittenAsSumOfTwoAbundantNumbers(28123);
        for (int i = 1; i < canBeWrittenAsSumTwoAbundantNumbers.length; i++) {
            if (!canBeWrittenAsSumTwoAbundantNumbers[i]) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean[] getNumbersThatCanBeWrittenAsSumOfTwoAbundantNumbers(int limit) {
        boolean[] canBeWrittenAsSumTwoAbundantNumbers = new boolean[limit + 1];
        List<Integer> abundantNumbers = getAbundantNumbers(limit);
        for (int a : abundantNumbers) {
            for (int b : abundantNumbers) {
                if (a + b < canBeWrittenAsSumTwoAbundantNumbers.length) {
                    canBeWrittenAsSumTwoAbundantNumbers[a + b] = true;
                }
            }
        }
        return canBeWrittenAsSumTwoAbundantNumbers;
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
