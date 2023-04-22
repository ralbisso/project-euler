package solutions;

import static utils.NumberUtils.isPalindromic;

public class Problem036 {

    public int solve() {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindromic(i) && isPalindromicBase2(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isPalindromicBase2(int number) {
        String binary = Integer.toBinaryString(number);
        int left = 0, right = binary.length() - 1;
        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
