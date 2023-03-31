package solutions;

import java.util.List;

import utils.FileUtils;

public sealed class Problem018 permits Problem067 {

    public int solve() {
        int[][] triangle = getTriangle(FileUtils.P018);
        return getMaximum(triangle);
    }

    protected int[][] getTriangle(String fileName) {
        List<String> input = FileUtils.getAllLines(fileName);
        int[][] triangle = new int[input.size()][];
        for (int i = 0; i < triangle.length; i++) {
            String[] split = input.get(i).split(" ");
            int[] row = new int[split.length];
            for (int j = 0; j < row.length; j++) {
                row[j] = Integer.parseInt(split[j]);
            }
            triangle[i] = row;
        }
        return triangle;
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
