package solutions;

import static utils.PolygonalUtils.isPentagonal;

public class Problem045 {

    public long solve() {
        int n = 144;
        long hexagon = n * (2 * n - 1);
        while (!isPentagonal(hexagon)) {
            n++;
            hexagon = (long) n * (2 * n - 1);
        }
        return hexagon;
    }
}
