package utils;

import java.util.Arrays;

public class NumberUtils {

    public static boolean isPalindromic(int number) {
        return number == getReverse(number);
    }

    public static boolean isPalindromic(long number) {
        return number == getReverse(number);
    }

    public static boolean isPermutation(int n, int m) {
        char[] nToChar = Integer.toString(n).toCharArray();
        char[] mToChar = Integer.toString(m).toCharArray();
        Arrays.sort(nToChar);
        Arrays.sort(mToChar);
        return Arrays.equals(nToChar, mToChar);
    }

    private static int getReverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static long getReverse(long number) {
        long reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getSumOfDigits(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
