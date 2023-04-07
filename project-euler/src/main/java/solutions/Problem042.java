package solutions;

import static utils.FileUtils.P042;
import static utils.FileUtils.getAllLinesAsStringArray;
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

    private int[] getTriangles(int size) {
        int[] triangles = new int[size + 1];
        triangles[0] = 1;
        for (int i = 1; i < triangles.length; i++) {
            triangles[i] = triangles[i - 1] + i + 1;
        }
        return triangles;
    }
}
