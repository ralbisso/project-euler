package solutions;

import static utils.FileUtils.P018;
import static utils.FileUtils.getAllLinesAsGrid;

public sealed class Problem018 permits Problem067 {

    public int solve() {
        var triangle = getAllLinesAsGrid(P018, " ");
        return getMaximum(triangle);
    }

    protected int getMaximum(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                int left = triangle[i][j] + triangle[i + 1][j];
                int right = triangle[i][j] + triangle[i + 1][j + 1];
                triangle[i][j] = Math.max(left, right);
            }
        }
        return triangle[0][0];
    }
}
