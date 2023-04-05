package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;
import static utils.PrimeUtils.isPrime;

import java.util.function.Function;

public class Problem027 {

    public int solve() {
        // If n = 0, then n² + an + b = b, so b should be prime
        var primes = getSieveOfEratosthenes(1000);
        int max = 0, product = 0, length = primes.length;
        for (int a = -999; a < 1000; a++) {
            for (int b = 3; b < length; b += 2) {
                if (primes[b]) {
                    var quadratic = getQuadratic(a, b);
                    int output = b, numberOfPrimes = 0;
                    while ((output >= 0 && output < length && primes[output]) || isPrime(output)) {
                        numberOfPrimes++;
                        output = quadratic.apply(numberOfPrimes);
                    }
                    if (numberOfPrimes > max) {
                        max = numberOfPrimes;
                        product = a * b;
                    }
                }
            }
        }
        return product;
    }

    private Function<Integer, Integer> getQuadratic(int a, int b) {
        return n -> n * n + a * n + b;
    }
}
