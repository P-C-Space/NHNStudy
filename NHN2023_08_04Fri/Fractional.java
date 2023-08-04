package NHN2023_08_04Fri;

// primitive operations to define (data) a type(set)
// 데이터 설계
// 하나의 primitive operation을 찾는 것
public class Fractional {
    private int numerator;
    private int denominator;
    // private int[] rep;

    // private Fractional() {}

    public Fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is to big");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        // rep = new int[] {numerator, denominator};
        // normalize();
        // classInvariant(rep);

    }

    public int numerator() {
        return this.numerator;
    }

    public int denominator() {
        return this.denominator;
    }

    private void normalize() {
        int gcd = Mathx.GCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fractional add(Fractional r) {
        int x = this.numerator() * this.denominator() + this.denominator() * this.numerator();
        int y = this.denominator() * this.denominator();
        return new Fractional(x, y);
    }

    public boolean isEqual(Fractional that) {
        if (this == that)
            return true;
        if (that == null) 
            return false;
        return (this.denominator() * that.numerator() == (this.numerator() * that.denominator()));
    }

    @Override
    public String toString() {
        return "Fractional [numerator=" + numerator + ", denominator=" + denominator + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numerator;
        result = prime * result + denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fractional))
            return false;
        Fractional other = (Fractional) obj;
        return this.isEqual(other);
    }

    // public final String toString() {
    // return this.numerator() + "/" + this.denominator();
    // }
}
