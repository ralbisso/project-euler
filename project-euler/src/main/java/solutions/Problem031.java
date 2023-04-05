package solutions;

public class Problem031 {

    public int solve() {
        int value = 200;
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
        var ways = new int[value + 1];
        ways[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= value; i++) {
                ways[i] += ways[i - coin];
            }
        }
        return ways[value];
    }
}
