package utils;

public class PermutationUtils {

    public static boolean nextPermutation(int[] array) {
        int n = array.length, i = n - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = n - 1;
        while (j >= 0 && array[i] >= array[j]) {
            j--;
        }
        swap(array, i, j);
        reverse(array, i + 1, n - 1);
        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void reverse(int[] array, int i, int j) {
        while (i < j) {
            swap(array, i++, j--);
        }
    }
}
