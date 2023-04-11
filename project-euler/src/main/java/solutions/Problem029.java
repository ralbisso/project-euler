package solutions;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem029 {

    public int solve() {
        int limit = 100;
        var distinctPowers = new HashSet<>();
        for (int a = 2; a <= limit; a++) {
            var bigA = BigInteger.valueOf(a);
            var power = bigA;
            for (int b = 1; b < limit; b++) {
                power = power.multiply(bigA);
                distinctPowers.add(power);
            }
        }
        return distinctPowers.size();
    }
}
