package solutions;

import utils.Triplet;

public class Problem009 {

    public int solve() {
        int perimeter = 1000;
        for (int a = 3; a < perimeter; a++) {
            for (int b = a + 1; a + b < perimeter; b++) {
                int c = perimeter - (a + b);
                var triplet = new Triplet(a, b, c);
                if (triplet.isPythagorean()) {
                    return triplet.product();
                }
            }
        }
        return 0;
    }
}
