package utils;

public class NumberUtils {

    public static boolean isPalindromic(int number) {
        return number == getReverse(number);
    }

    public static boolean isPalindromic(long number) {
        return number == getReverse(number);
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
