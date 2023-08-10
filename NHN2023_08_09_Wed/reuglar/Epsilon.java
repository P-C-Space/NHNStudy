package NHN2023_08_09_Wed.reuglar;

public final class Epsilon implements Expression {
    @Override
    public String toString() {
        return "\u03B5";
    }

    @Override
    public final String literals() {
        return "";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEpsilon(this);
    }
}
