package exam;

import java.math.BigInteger;

public class Fractional {
    private long numerator;
    private long denominator;
    private boolean normalized;

    private Fractional(long numerator, long denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("분자가 0이야! 공부 다시해!");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        normalize();
        return numerator;
    }

    public long getDenominator() {
        normalize();
        return denominator;
    }

    private void normalize() {
        if (normalized)
            return;
        long gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).longValue();
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        normalized = true;
    }

    public Fractional add(Fractional r) {
        return new Fractional(
                this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator(),
                this.getDenominator() * r.getDenominator());

    }

    @Override
    public String toString() {
        return "Fractional [numerator=" + numerator + ", denominator=" + denominator + "]";
    }

    @Override // 해시 함수의 오류 //기존의 코드는 각각의 해시함수로 처리했다.
    public int hashCode() {
        int prime = 31;
        long result = 1;
        result = prime * result + this.getNumerator();
        result = prime * result + this.getDenominator();
        return (int)result;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        if (getClass() != that.getClass())
            return false;
        Fractional other = (Fractional) that;
        return this.equals((Fractional) other);
    }

    private boolean equals(Fractional that) {
        return this.getNumerator() == that.getNumerator()
                && this.getDenominator() == that.getDenominator();
    }

    public static Fractional of(int numerator, int denominator) {
        return new Fractional(numerator, denominator);
    }

}
