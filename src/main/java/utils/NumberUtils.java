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
        if (length < 10) {
            return false;
        }
        int[] trace = new int[length];
        for (int i = 0; i < length; i++) {
            if (++trace[number[i]] == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean is1To9Pandigital(int number) {
        if (number < 123456789 || number > 987654321) {
            return false;
        }
        return is1ToNPandigital(number);
    }

    public static boolean is1ToNPandigital(int number) {
        int size = getSize(number);
        int[] trace = new int[size];
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || digit > size || ++trace[digit - 1] == 2) {
                return false;
            }
            number /= 10;
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
        return b == 0 ? a : getGCD(b, a % b);
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

    public static int getSize(int number) {
        return (int) Math.log10(number) + 1;
    }
}
