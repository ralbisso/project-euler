package solutions;

import static utils.NumberUtils.getSumOfDigits;

import java.math.BigInteger;

public class Problem016 {

    public int solve() {
        BigInteger big = BigInteger.TWO.pow(1000);
        return getSumOfDigits(big.toString());
    }
}
