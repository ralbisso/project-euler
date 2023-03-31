package solutions;

import java.util.HashSet;

import utils.PrimeUtils;

public class Problem808 {

    public long solve() {
        long sum = 0;
        int count = 0, i = 3;
        boolean[] primes = PrimeUtils.getSieveOfEratosthenes(32000000);
        var primeSquares = new HashSet<>();
        while (count < 50) {
            if (primes[i]) {
                long square = (long) i * (long) i;
                long reverse = getReverse(square);
                primeSquares.add(square);
                if (primeSquares.contains(reverse) && !isPalindromic(square)) {
                    count += 2;
                    sum += square + reverse;
                }
            }
            i += 2;
        }
        return sum;
    }

    private boolean isPalindromic(long number) {
        return number == getReverse(number);
    }

    private long getReverse(long number) {
        long reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}
