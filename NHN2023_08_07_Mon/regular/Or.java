package NHN2023_08_07_Mon.regular;

public final class Or extends BinaryOperation {
    // private Expression expression1;
    // private Expression expression2;


    public Or(Expression left, Expression right) {
        //super(left, "|", right);
        super(left,right);
    }

    @Override
    public String getOperator() {      
        return "|";
    }

    // @Override
    // public String toString() {
    //     return "(" + getExpression1() + getOperator() + getExpression2() + ")";
    // }

    // public Expression getExpression1() {
    //     return expression1;
    // }

    // public Expression getExpression2() {
    //     return expression2;
    // }

}
