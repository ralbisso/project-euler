package solutions;

import static utils.FileUtils.P022;
import static utils.FileUtils.getAllLinesAsString;

import java.util.Arrays;

public class Problem022 {

    private final static String ALPHABET = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public int solve() {
        var input = getAllLinesAsString(P022).split(",");
        Arrays.sort(input);
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total += getScore(i, input[i]);
        }
        return total;
    }

    private int getScore(int i, String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += ALPHABET.indexOf(c);
        }
        return score * (i + 1);
    }
}
