package solutions;

import static utils.NumberUtils.getLCM;

public class Problem005 {

    public int solve() {
        // A number divisible by 1, ... , n is the least common multiple of (1, ... , n)
        // LCM properties :
        // - LCM(a, b) = (a x b) / GCD(a, b)
        // - LCM(a0, a1, ... , an) = LCM(a0, LCM(a1, ... , an))
        int number = 1;
        for (int divisor = 2; divisor <= 20; divisor++) {
            number = (int) getLCM(divisor, number);
        }
        return number;
    }
}
