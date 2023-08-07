package NHN2023_08_05_Mon.regular;

public final class Or implements Expression {
    private Expression expression1;
    private Expression expression2;

    public Or(Expression a, Expression b) {
        this.expression1 = a;
        this.expression2 = b;
    }

    @Override
    public String toString() {
        return "(" + this.getExpression1() + "|" + this.getExpression2() + ")";
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    // @Override
    // public Expression or(Expression e) {
    //         return new Or(this, e);
    // }
}
