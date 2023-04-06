package objects;

import static utils.NumberUtils.getGCD;

public final class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction multiply(Fraction fraction) {
        int numerator = this.numerator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction simplify() {
        int gcd = (int) getGCD(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that instanceof Fraction) {
            Fraction thisSimplified = simplify();
            Fraction thatSimplified = ((Fraction) that).simplify();
            return thisSimplified.numerator == thatSimplified.numerator
                    && thisSimplified.denominator == thatSimplified.denominator;
        }
        return false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
