package solutions;

import java.util.Arrays;

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

    private boolean[] getSieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
}
