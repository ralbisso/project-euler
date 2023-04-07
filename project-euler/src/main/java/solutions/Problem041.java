package solutions;

import static utils.NumberUtils.is1ToNPandigital;
import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem041 {

    public int solve() {
        int max = 0;
        // The limit was reduced for performance reasons
        boolean[] primes = getSieveOfEratosthenes(8000000);
        for (int i = 1; i < primes.length; i++) {
            if (primes[i] && is1ToNPandigital(i)) {
                max = i;
            }
        }
        return max;
    }
}
