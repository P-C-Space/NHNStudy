package NHN2023_08_05_Mon.regular;

public final class Then implements Expression{
    private Expression expression1;
    private Expression expression2;
    public Then(Expression a,Expression b){
        this.expression1 = a;
        this.expression2 = b;
    }

    @Override
    public String toString(){
        return "(" + this.getExpression1() + this.getExpression2() + ")";
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }
}
