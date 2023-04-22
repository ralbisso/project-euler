package solutions;

public class Problem048 {

    public long solve() {
        long sum = 0, mod = (long) Math.pow(10, 10);
        long[] selfPowers = new long[1000];
        for (int i = 0; i < selfPowers.length; i++) {
            int number = i + 1;
            selfPowers[i] = number;
            for (int j = 1; j <= i; j++) {
                selfPowers[i] *= number;
                selfPowers[i] %= mod;
            }
            sum += selfPowers[i];
        }
        return sum % mod;
    }
}
