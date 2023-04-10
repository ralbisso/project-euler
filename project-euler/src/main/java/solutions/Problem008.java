package solutions;

import static utils.FileUtils.P008;
import static utils.FileUtils.getAllLinesConcatenated;

public class Problem008 {

    public long solve() {
        long max = 0;
        var series = getAllLinesConcatenated(P008);
        int size = 13;
        for (int i = 0; i <= series.length() - size; i++) {
            long product = getProduct(series.substring(i, i + size));
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    private long getProduct(String substring) {
        long product = 1;
        for (char c : substring.toCharArray()) {
            if (c == '0') {
                return 0;
            }
            product *= Character.getNumericValue(c);
        }
        return product;
    }
}
