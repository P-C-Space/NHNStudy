package NHN2023_08_07_Mon.regular;

public abstract class BinaryOperation implements Expression {
    private Expression expression1;
    private Expression expression2;
    //private String operator;

    // protected BinaryOperation(Expression left, String string, Expression right) {
    //     expression1 = left;
    //     expression2 = right;
    //     operator = string;
    // }
    protected BinaryOperation(Expression left,Expression right){
        expression1 = left;
        expression2 = right;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    // public String getOperator() {
    //     return operator;
    // }

    @Override
    public String toString() {
        return "(" + getExpression1() + getOperator() + getExpression2() + ")";
    }

    protected abstract String getOperator();
}
