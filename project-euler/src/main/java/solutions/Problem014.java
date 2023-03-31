package solutions;

public class Problem014 {

    public int solve() {
        int max = 1, longest = 1;
        for (int i = 1; i < 1000000; i++) {
            long number = i;
            int length = 1;
            while (number > 1) {
                number = getNextCollatzTerm(number);
                length++;
            }
            if (length > longest) {
                longest = length;
                max = i;
            }
        }
        return max;
    }

    private long getNextCollatzTerm(long number) {
        return number % 2 == 0 ? number / 2 : 3 * number + 1;
    }
}
