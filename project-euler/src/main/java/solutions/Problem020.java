package solutions;

import static utils.BigIntegerUtils.getFactorial;
import static utils.BigIntegerUtils.getSumOfDigits;

public class Problem020 {

    public int solve() {
        return getSumOfDigits(getFactorial(100));
    }
}
