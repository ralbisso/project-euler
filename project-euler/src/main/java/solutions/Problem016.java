package solutions;

import static utils.BigIntegerUtils.getSumOfDigits;

import java.math.BigInteger;

public class Problem016 {

    public int solve() {
        return getSumOfDigits(BigInteger.TWO.pow(1000));
    }
}
