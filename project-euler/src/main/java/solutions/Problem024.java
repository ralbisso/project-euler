package solutions;

import static utils.NumberUtils.getFactorial;

public class Problem024 {

    public long solve() {
        long millionth = 0;
        int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int remaining = 999999;
        for (int i = 9; i >= 0; i--) {
            int groupSize = getFactorial(i);
            int index = remaining / groupSize;
            remaining %= groupSize;
            millionth = millionth * 10 + digits[index];
            for (int j = index; j < i; j++) {
                digits[j] = digits[j + 1];
            }
        }
        return millionth;
    }
}
