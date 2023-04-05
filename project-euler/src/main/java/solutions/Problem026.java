package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem026 {

    public int solve() {
        // We know that primes will generate the longest cycles
        int number = 1, max = 0;
        boolean[] primes = getSieveOfEratosthenes(1000);
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                int cycle = 1, remainder = 10 % i;
                while (remainder != 1 && cycle < i - 1) {
                    remainder = (remainder * 10) % i;
                    cycle++;
                }
                if (cycle > max) {
                    max = cycle;
                    number = i;
                }
            }
        }
        return number;
    }
}
