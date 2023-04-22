package utils;

import java.util.Arrays;

public class PrimeUtils {

    public static boolean isPrime(int n) {
        if (n < 7) {
            return n == 2 || n == 3 || n == 5;
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 6; i <= sqrt; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] getSieveOfEratosthenes(int n) {
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

    public static int[] getEulerTotients(int n) {
        int[] phi = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            phi[i] = i;
        }
        for (int p = 2; p <= n; p++) {
            if (phi[p] == p) {
                for (int i = p; i <= n; i += p) {
                    phi[i] = phi[i] / p * (p - 1);
                }
            }
        }
        return phi;
    }
}
