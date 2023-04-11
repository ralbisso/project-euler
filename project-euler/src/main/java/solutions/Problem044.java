package solutions;

import static utils.PolygonalUtils.getPentagons;
import static utils.PolygonalUtils.isPentagonal;

import java.util.Arrays;

public class Problem044 {

    public int solve() {
        int[] pentagons = getPentagons(2500);
        for (int i = pentagons.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int difference = pentagons[i] - pentagons[j];
                if (Arrays.binarySearch(pentagons, difference) >= 0) {
                    if (isPentagonal(pentagons[i] + pentagons[j])) {
                        return difference;
                    }
                }
            }
        }
        return 0;
    }
}
