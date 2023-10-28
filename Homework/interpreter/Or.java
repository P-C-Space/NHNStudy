package Homework.interpreter;

public class Or implements Expression {
    @Override
    public String toString() {
        return "(" + getE1() + "|" + getE2() + ")";
    }

    Expression e1, e2;

    public Or(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Expression getE1() {
        return e1;
    }

    public Expression getE2() {
        return e2;
    }

}
