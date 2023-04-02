package utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class BigIntegerUtils {
    
    public static BigInteger getFactorial(int number) {
        return IntStream.range(1, number + 1)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, (b1, b2) -> b1.multiply(b2));
    }
    
    public static BigInteger getBinomialCoefficient(int n, int k) {
        BigInteger numerator = getFactorial(n);
        BigInteger denominator = getFactorial(k).multiply(getFactorial(n - k));
        return numerator.divide(denominator);
    }
}
