package solutions;

import static utils.FileUtils.P067;
import static utils.FileUtils.getAllLinesAsGrid;

public final class Problem067 extends Problem018 {

    public int solve() {
        int[][] triangle = getAllLinesAsGrid(P067);
        return getMaximum(triangle);
    }
}
