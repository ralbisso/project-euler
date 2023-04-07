package solutions;

public class Problem094 {

    public int solve() {
        int sum = 0, limit = 1000000000;
        for (int a = 2; a <= limit / 3; a++) {
            for (int b = a - 1; b <= a + 1; b++) {
                if (2 * a - b > 0 && 2 * a - b <= limit / 3) {
                    int c = 2 * a - b;
                    if (a + b + c <= limit) {
                        int s = (a + b + c) / 2;
                        int area = s * (s - a) * (s - b) * (s - c);
                        if (area > 0 && Math.sqrt(area) % 1 == 0) {
                            sum += a + b + c;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
