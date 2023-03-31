package solutions;

public class Problem014 {

    public int solve() {
        int max = 1, longest = 1;
        for (int start = 1; start < 1000000; start++) {
            long collatz = start;
            int length = 1;
            while (collatz > 1) {
                collatz = getNextCollatzTerm(collatz);
                length++;
            }
            if (length > longest) {
                longest = length;
                max = start;
            }
        }
        return max;
    }

    private long getNextCollatzTerm(long number) {
        return number % 2 == 0 ? number / 2 : 3 * number + 1;
    }
}
