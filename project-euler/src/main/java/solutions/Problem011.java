package solutions;

import static utils.FileUtils.P011;
import static utils.FileUtils.getAllLinesAsGrid;

public class Problem011 {

    public int solve() {
        int[][] grid = getAllLinesAsGrid(P011);
        int length = grid.length, max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] > 0) {
                    int maxProduct = getPointMaxProduct(i, j, grid);
                    if (maxProduct > max) {
                        max = maxProduct;
                    }
                }
            }
        }
        return max;
    }

    private int getPointMaxProduct(int i, int j, int[][] grid) {
        int antidiagonal = grid[i][j], diagonal = grid[i][j];
        int horizontal = grid[i][j], vertical = grid[i][j];
        for (int k = 1; k < 4; k++) {
            antidiagonal *= getNextTerm(grid, i + k, j - k);
            diagonal *= getNextTerm(grid, i + k, j + k);
            horizontal *= getNextTerm(grid, i, j + k);
            vertical *= getNextTerm(grid, i + k, j);
        }
        return getMax(antidiagonal, diagonal, horizontal, vertical);
    }

    private int getNextTerm(int[][] grid, int i, int j) {
        if (i < grid.length && j >= 0 && j < grid.length) {
            return grid[i][j];
        }
        return 0;
    }

    private int getMax(int antidiagonal, int diagonal, int horizontal, int vertical) {
        int max = 0;
        max = Math.max(max, antidiagonal);
        max = Math.max(max, diagonal);
        max = Math.max(max, horizontal);
        max = Math.max(max, vertical);
        return max;
    }
}
