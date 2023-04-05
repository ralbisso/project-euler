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

    public static boolean is0To9Pandigital(int[] number) {
        int length = number.length;
        int[] trace = new int[length];
        for (int i = 0; i < length; i++) {
            if (++trace[number[i]] == 2) {
                return false;
            }
        }
        return true;
    }

    public static int getFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long getGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public static long getLCM(long a, long b) {
        return (a * b) / getGCD(a, b);
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
}
