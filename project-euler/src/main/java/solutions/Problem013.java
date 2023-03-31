package solutions;

import java.math.BigInteger;

import static utils.FileUtils.*;

public class Problem013 {

    public long solve() {
        BigInteger sum = getAllLines(P013)
                .stream()
                .map(BigInteger::new)
                .reduce(BigInteger.ZERO, (b1, b2) -> b1.add(b2));
        return Long.parseLong(sum.toString().substring(0, 10));
    }
}
