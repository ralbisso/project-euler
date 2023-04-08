package solutions;

import objects.Fraction;

public class Problem033 {

    public int solve() {
        var result = new Fraction(1, 1);
        for (int a = 10; a < 100; a++) {
            for (int b = a + 1; b < 100; b++) {
                var fraction = new Fraction(a, b);
                if (isDigitCancellable(fraction)) {
                    result = result.multiply(fraction);
                }
            }
        }
        return result.simplify().getDenominator();
    }

    private boolean isDigitCancellable(Fraction fraction) {
        boolean isDigitCancellable = false;
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        int numTens = numerator / 10, numUnits = numerator % 10;
        int denTens = denominator / 10, denUnits = denominator % 10;
        // Case X3/X2
        isDigitCancellable = isDigitCancellable
                || isDigitCancellable(fraction, numTens, denTens, numUnits, denUnits);
        // Case X3/2X
        isDigitCancellable = isDigitCancellable
                || isDigitCancellable(fraction, numTens, denUnits, numUnits, denTens);
        // Case 3X/X2
        isDigitCancellable = isDigitCancellable
                || isDigitCancellable(fraction, numUnits, denTens, numTens, denUnits);
        // Case 3X/2X (X = 0 is a trivial example)
        if (numUnits > 0 && numUnits == denominator % 10) {
            isDigitCancellable = isDigitCancellable
                    || isDigitCancellable(fraction, numUnits, denUnits, numTens, denTens);
        }
        return isDigitCancellable;
    }

    private boolean isDigitCancellable(Fraction fraction, int eq1, int eq2, int frac1, int frac2) {
        if (eq1 == eq2) {
            var digitCancelled = new Fraction(frac1, frac2);
            if (fraction.equals(digitCancelled)) {
                return true;
            }
        }
        return false;
    }
}
