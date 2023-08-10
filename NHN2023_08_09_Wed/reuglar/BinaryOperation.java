package NHN2023_08_09_Wed.reuglar;

abstract class BinaryOperation {
    private Expression expression1;
    private Expression expression2;
    private String operator;

    protected BinaryOperation(Expression left,String operator,Expression right){
        expression1 = left;
        expression2 = right;
        this.operator = operator;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public String getOperator(){
        return this.operator;
    }

    @Override
    public String toString() {
        return "(" + getExpression1() + getOperator() + getExpression2() + ")";
    }

}
