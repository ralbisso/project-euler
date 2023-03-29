package solutions;

public class Problem001 {

    public int solve() {
        int sum = 0;
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum += n;
            }
        }
        return sum;
    }
}
