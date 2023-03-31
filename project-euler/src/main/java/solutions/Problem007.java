package solutions;

import utils.PrimeUtils;

public class Problem007 {

    public int solve() {
        int count = 2, number = 3;
        while (count < 10001) {
            number += 2;
            if (PrimeUtils.isPrime(number)) {
                count++;
            }
        }
        return number;
    }
}
