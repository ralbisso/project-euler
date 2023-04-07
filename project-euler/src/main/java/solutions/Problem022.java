package solutions;

import static utils.FileUtils.P022;
import static utils.FileUtils.getAllLinesAsStringArray;
import static utils.StringUtils.getScore;

import java.util.Arrays;

public class Problem022 {

    public int solve() {
        var input = getAllLinesAsStringArray(P022);
        Arrays.sort(input);
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total += getScore(i, input[i]);
        }
        return total;
    }
}
