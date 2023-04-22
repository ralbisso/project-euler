package solutions;

public class Problem009 {

    public int solve() {
        int perimeter = 1000;
        for (int a = 3; a < perimeter; a++) {
            for (int b = a + 1; a + b < perimeter; b++) {
                int c = perimeter - (a + b);
                if (isPythagorean(a, b, c)) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }

    private boolean isPythagorean(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
