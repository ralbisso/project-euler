package solutions;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Problem029 {

    public int solve() {
        int limit = 100;
        Set<BigInteger> distinctPowers = new HashSet<>();
        for (int a = 2; a <= limit; a++) {
            for (int b = 2; b <= limit; b++) {
                BigInteger power = BigInteger.valueOf(a).pow(b);
                distinctPowers.add(power);
            }
        }
        return distinctPowers.size();
    }
}
