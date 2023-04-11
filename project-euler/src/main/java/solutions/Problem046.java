package solutions;

import static utils.PolygonalUtils.getSquares;
import static utils.PrimeUtils.getSieveOfEratosthenes;

public class Problem046 {

    public int solve() {
        int limit = 10000;
        var canBeWrittenAsSumOfAPrimeAndTwiceASquare = new boolean[limit + 1];
        var primes = getSieveOfEratosthenes(limit);
        var squares = getSquares(500);
        for (int i = 3; i < primes.length; i++) {
            if (primes[i]) {
                for (int square : squares) {
                    int composite = i + 2 * square;
                    if (composite > limit) {
                        break;
                    }
                    canBeWrittenAsSumOfAPrimeAndTwiceASquare[composite] = true;
                }
            }
        }
        int min = 5;
        while (primes[min] || canBeWrittenAsSumOfAPrimeAndTwiceASquare[min]) {
            min += 2;
        }
        return min;
    }
}
