package objects;

import static utils.NumberUtils.getGCD;

public final class Fraction {

    private final int numerator;
    private final int denominator;
    private final int numeratorInLCT;
    private final int denominatorInLCT;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        int gcd = (int) getGCD(numerator, denominator);
        this.numeratorInLCT = numerator / gcd;
        this.denominatorInLCT = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getDenominatorInLCT() {
        return denominatorInLCT;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Fraction) {
            Fraction fraction = (Fraction) other;
            return this.numeratorInLCT == fraction.numeratorInLCT
                    && this.denominatorInLCT == fraction.denominatorInLCT;
        }
        return false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
