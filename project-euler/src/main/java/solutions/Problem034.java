package solutions;

public class Problem034 {

    public int solve() {
        int sum = 0;
        var factorials = getDigitFactorials();
        for (int i = 10; i <= 6 * factorials[9]; i++) {
            int number = i, sumOfDigitFactorials = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sumOfDigitFactorials += factorials[digit];
            }
            if (sumOfDigitFactorials == i) {
                sum += i;
            }
        }
        return sum;
    }

    private int[] getDigitFactorials() {
        var factorials = new int[10];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        return factorials;
    }
}
