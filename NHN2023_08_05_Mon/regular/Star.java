package NHN2023_08_05_Mon.regular;

public final class Star implements Expression{
    private Expression expression;
    public Star(Expression a){
        this.expression = a;
    }
    @Override
    public String toString(){
        return "(" + this.getExpression() + ")*";
    }
    public Expression getExpression() {
        return expression;
    }
}
