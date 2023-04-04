package solutions;

import java.math.BigInteger;

public class Problem025 {

    public int solve() {
        BigInteger[] fibonacci = { BigInteger.ZERO, BigInteger.ONE };
        int index = 1;
        while (fibonacci[1].toString().length() < 1000) {
            BigInteger next = fibonacci[0].add(fibonacci[1]);
            fibonacci[0] = fibonacci[1];
            fibonacci[1] = next;
            index++;
        }
        return index;
    }
}
