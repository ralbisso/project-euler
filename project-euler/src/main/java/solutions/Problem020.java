package solutions;

import static utils.BigIntegerUtils.getFactorial;
import static utils.NumberUtils.getSumOfDigits;

import java.math.BigInteger;

public class Problem020 {

    public int solve() {
        BigInteger factorial = getFactorial(100);
        return getSumOfDigits(factorial.toString());
    }
}
