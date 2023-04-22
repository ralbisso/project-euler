package solutions;

import static utils.NumberUtils.getSize;
import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem035 {

    public int solve() {
        int count = 0;
        var primes = getSieveOfEratosthenes(1000000);
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                var rotations = getRotations(i);
                boolean isCircularPrime = true;
                for (int j = 0; j < rotations.length; j++) {
                    if (!primes[rotations[j]]) {
                        isCircularPrime = false;
                        break;
                    }
                }
                if (isCircularPrime) {
                    count++;
                }
            }
        }
        return count;
    }

    private int[] getRotations(int number) {
        int size = getSize(number) - 1;
        int offset = (int) Math.pow(10, size);
        var rotations = new int[size];
        for (int i = 0; i < rotations.length; i++) {
            int last = number % 10;
            number = last * offset + number / 10;
            rotations[i] = number;
        }
        return rotations;
    }
}
