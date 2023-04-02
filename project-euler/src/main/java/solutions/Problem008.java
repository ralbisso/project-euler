package solutions;

import static utils.FileUtils.P008;
import static utils.FileUtils.getAllLines;

public class Problem008 {

    public long solve() {
        long max = 0;
        var series = getAllLines(P008).stream().reduce("", (s1, s2) -> s1 + s2);
        for (int i = 0; i <= series.length() - 13; i++) {
            long product = getProduct(series.substring(i, i + 13));
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    private long getProduct(String substring) {
        if (substring.indexOf('0') > 0) {
            return 0;
        }
        long product = 1;
        for (char c : substring.toCharArray()) {
            product *= Character.getNumericValue(c);
        }
        return product;
    }
}
