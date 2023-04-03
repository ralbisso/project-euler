package utils;

public class DivisorsUtils {

    public static int[] getNumberOfDivisors(int limit) {
        int[] numberOfDivisors = new int[limit + 1];
        int length = numberOfDivisors.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j < length; j += i) {
                numberOfDivisors[j]++;
            }
        }
        return numberOfDivisors;
    }

    public static int[] getSumOfDivisors(int limit) {
        int[] sumOfDivisors = new int[limit + 1];
        int length = sumOfDivisors.length;
        for (int i = 1; i < length; i++) {
            for (int j = i * 2; j < length; j += i) {
                sumOfDivisors[j] += i;
            }
        }
        return sumOfDivisors;
    }
}
