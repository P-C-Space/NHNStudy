package Homework.visitor;

abstract class BinaryOperation {
    private Expression e1, e2;
    public Expression getE1() {
        return e1;
    }

    public Expression getE2() {
        return e2;
    }

    private String operator;

    public String getOperator() {
        return operator;
    }

    protected BinaryOperation(Expression left, String op,Expression right){
        this.e1 = left;
        this.e2 = right;
        this.operator = op;
    }

    @Override
    public String toString(){
        return "(" + getE1() + getOperator() + getE2() + ")";
    }
}
