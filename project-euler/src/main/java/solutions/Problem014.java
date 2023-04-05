package solutions;

public class Problem014 {

    public int solve() {
        int max = 1, longest = 1, limit = 1000000;
        int[] memo = new int[limit];
        for (int start = 1; start < limit; start++) {
            long collatz = start;
            int length = 0;
            while (collatz > 1) {
                if (collatz < limit && memo[(int) collatz] != 0) {
                    length += memo[(int) collatz];
                    break;
                }
                collatz = getNextCollatzTerm(collatz);
                length++;
            }
            memo[start] = length;
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
