package solutions;

public class Problem100 {

    public long solve() {
        /*
         * P(BB) = (B/T)*((B-1)/(T-1)) = 0.5
         * 2B(B-1) = T(T-1)
         * 2B²-T²-2B + T = 0 or 2x² - y² - 2x + y = 0
         * 
         * Using a quadratic diophantine equation solver
         * Initial solution: (x0 = 1, y0 = 1)
         *  
         * Recursive solutions:
         * (xN+1, yN+1) = (3xN + 2yN - 2, 4xN + 3yN - 3)
         */
        long blue = 1, total = 1;
        while (total < 1000000000000L) {
            long blueTmp = blue;
            long totalTmp = total;
            blue = 3 * blueTmp + 2 * totalTmp - 2;
            total = 4 * blueTmp + 3 * totalTmp - 3;
        }
        return blue;
    }
}
