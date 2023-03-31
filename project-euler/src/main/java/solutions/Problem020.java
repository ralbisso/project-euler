package solutions;

import static utils.NumberUtils.getSumOfDigits;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Problem020 {

    public int solve() {
        BigInteger factorial = getFactorial(100);
        return getSumOfDigits(factorial.toString());
    }
    
    private BigInteger getFactorial(int number) {
        return IntStream.range(1, number + 1)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, (b1, b2) -> b1.multiply(b2));
    }
}
