package solutions;

import utils.FileUtils;

public final class Problem067 extends Problem018 {

    public int solve() {
        int[][] triangle = getTriangle(FileUtils.P067);
        return getMaximum(triangle);
    }
}
