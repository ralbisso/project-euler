package solutions;

import static utils.FileUtils.P042;
import static utils.FileUtils.getAllLinesAsStringArray;
import static utils.PolygonalUtils.getTriangles;
import static utils.StringUtils.getScore;

import java.util.Arrays;

public class Problem042 {

    public int solve() {
        int count = 0;
        var triangles = getTriangles(20);
        for (String word : getAllLinesAsStringArray(P042)) {
            int score = getScore(word);
            if (Arrays.binarySearch(triangles, score) >= 0) {
                count++;
            }
        }
        return count;
    }
}
