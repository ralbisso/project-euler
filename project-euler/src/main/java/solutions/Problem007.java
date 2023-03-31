package solutions;

public class Problem007 {

    public int solve() {
        int count = 2, number = 3;
        while (count < 10001) {
            number += 2;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    private boolean isPrime(int n) {
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
}
