package solutions;

import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem035 {

    public int solve() {
        int count = 0;
        boolean[] primes = getSieveOfEratosthenes(1000000);
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                int[] rotations = getRotations(i);
                boolean isCircularPrime = true;
                for (int j = 1; j < rotations.length; j++) {
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
        int size = (int) Math.log10(number) + 1;
        int offset = (int) Math.pow(10, size - 1);
        int[] rotations = new int[size];
        rotations[0] = number;
        for (int i = 1; i < rotations.length; i++) {
            int last = number % 10;
            number = last * offset + number / 10;
            rotations[i] = number;
        }
        return rotations;
    }
}
