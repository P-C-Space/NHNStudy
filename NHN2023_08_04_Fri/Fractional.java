package NHN2023_08_04_Fri;

// primitive operations to define (data) a type(set)
// 데이터 설계
// 하나의 primitive operation을 찾는 것
public class Fractional extends java.lang.Number {
    private long numerator;
    private long denominator;
    // private int[] rep;

    // private Fractional() {}

    public Fractional(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is to big");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        // rep = new int[] {numerator, denominator};
        normalize();
        // classInvariant(rep);

    }

    public long getNumerator() {
        return this.numerator;
    }

    public long getDenominator() {
        return this.denominator;
    }

    private void normalize() {
        long gcd = Mathx.GCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fractional add(Fractional r) {
        long x = this.getNumerator() * this.getDenominator()
                + this.getDenominator() * this.getNumerator();
        long y = this.getDenominator() * this.getDenominator();
        return new Fractional(x, y);
    }

    public boolean isEqual(Fractional that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        return (this.getDenominator()
                * that.getNumerator() == (this.getNumerator() * that.getDenominator()));
    }

    @Override
    public String toString() {
        return "Fractional [numerator=" + numerator + ", denominator=" + denominator
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long result = 1;
        result = prime * result + this.getNumerator();
        result = prime * result + this.getDenominator();
        return (int) result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!(obj instanceof Fractional))
            return false;
        Fractional other = (Fractional) obj;
        return this.isEqual(other);
    }

    @Override
    public int intValue() {
        return (int) (this.longValue());
    }

    @Override
    public long longValue() {
        return (long) (this.getNumerator() / this.getDenominator());
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) this.getNumerator() / (double) this.getDenominator();
    }

    // public final String toString() {
    // return this.numerator() + "/" + this.denominator();
    // }
}
