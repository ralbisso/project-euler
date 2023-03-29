package solutions;

public class Problem004 {

    public int solve() {
        int max = 0;
        for (int n = 998; n > 100; n--) {
            for (int m = n + 1; m < 1000; m++) {
                int product = n * m;
                if (product > max && isPalindromic(product)) {
                    max = product;
                }
            }
        }
        return max;
    }

    private boolean isPalindromic(int number) {
        return number == getReverse(number);
    }

    private int getReverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}
