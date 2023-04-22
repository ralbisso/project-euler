package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem037 {

    public int solve() {
        int sum = 0, count = 0;
        var primes = getSieveOfEratosthenes(1000000);
        for (int i = 11; i < primes.length; i++) {
            if (primes[i]) {
                var truncations = getTruncations(i);
                boolean isTruncatablePrime = true;
                for (int j = 0; j < truncations.length; j++) {
                    if (!primes[truncations[j]]) {
                        isTruncatablePrime = false;
                        break;
                    }
                }
                if (isTruncatablePrime) {
                    sum += i;
                    if (++count == 11) {
                        break;
                    }
                }
            }
        }
        return sum;
    }

    private int[] getTruncations(int number) {
        int left = number, right = number;
        int size = (int) Math.log10(number);
        int offset = (int) Math.pow(10, size);
        var truncations = new int[2 * size];
        for (int i = 0; i < truncations.length; i += 2) {
            left %= offset;
            right /= 10;
            offset /= 10;
            truncations[i] = left;
            truncations[i + 1] = right;
        }
        return truncations;
    }
}
