package solutions;

public class Problem076 {

    public int solve() {
        int number = 100;
        int[] ways = new int[number + 1];
        ways[0] = 1;
        for (int i = 1; i < number; i++) {
            for (int j = i; j <= number; j++) {
                ways[j] += ways[j - i];
            }
        }
        return ways[number];
    }
}
