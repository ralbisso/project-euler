package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem010 {

    public long solve() {
        long sum = 0;
        boolean[] primes = getSieveOfEratosthenes(2000000);
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
