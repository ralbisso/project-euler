package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;

import java.util.function.Function;

public class Problem027 {

    public int solve() {
        // If n = 0, then n² + an + b = b, so b should be prime
        // If n = 1, then n² + an + b = a + b + 1, so a should be odd
        var primes = getSieveOfEratosthenes(1000);
        for (int b = 2; b < primes.length; b++) {
            if (primes[b]) {
                for (int a = -b; a < 1000; a++) {
                    var quadratic = getQuadratic(a, b);
                }
            }
        }
        return 0;
    }

    private Function<Integer, Integer> getQuadratic(int a, int b) {
        return n -> n * n + a * n + b;
    }
}
