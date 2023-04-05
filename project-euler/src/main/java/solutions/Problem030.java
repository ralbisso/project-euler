package solutions;

public class Problem030 {

    public int solve() {
        int sum = 0;
        var fifthPowers = getDigitFifthPowers();
        for (int i = 2; i <= 6 * fifthPowers[9]; i++) {
            int number = i, sumOfDigitFifthPowers = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sumOfDigitFifthPowers += fifthPowers[digit];
            }
            if (sumOfDigitFifthPowers == i) {
                sum += i;
            }
        }
        return sum;
    }

    private int[] getDigitFifthPowers() {
        var fifthPowers = new int[10];
        for (int i = 0; i < fifthPowers.length; i++) {
            fifthPowers[i] = (int) Math.pow(i, 5);
        }
        return fifthPowers;
    }
}
