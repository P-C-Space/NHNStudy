package NHN2023_08_09_Wed.reuglar;

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
    @Override
    public String literals(){
        return this.getExpression().literals();
    }

    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitStar(this); 
    }
}
