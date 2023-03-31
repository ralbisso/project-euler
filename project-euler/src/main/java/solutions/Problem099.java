package solutions;

import static utils.FileUtils.P099;
import static utils.FileUtils.getAllLines;

public class Problem099 {

    public int solve() {
        int index = 1;
        double max = 0;
        var lines = getAllLines(P099);
        for (int i = 0; i < lines.size(); i++) {
            String[] split = lines.get(i).split(",");
            int base = Integer.parseInt(split[0]);
            int exp = Integer.parseInt(split[1]);
            double log = (double) exp * Math.log(base);
            if (log > max) {
                max = log;
                index = i + 1;
            }
        }
        return index;
    }
}
