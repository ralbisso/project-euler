package solutions;

import static utils.NumberUtils.getReverse;
import static utils.NumberUtils.isPalindromic;
import static utils.PrimeUtils.getSieveOfEratosthenes;

import java.util.HashSet;

public class Problem808 {

    public long solve() {
        long sum = 0, i = 3;
        int count = 0;
        boolean[] primes = getSieveOfEratosthenes(32000000);
        var primeSquares = new HashSet<>();
        while (count < 50) {
            if (primes[(int) i]) {
                long square = i * i;
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
}
