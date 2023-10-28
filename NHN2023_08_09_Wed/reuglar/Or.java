package NHN2023_08_09_Wed.reuglar;

public class Or extends BinaryOperation implements Expression  {
    public Or(Expression left, Expression right) {
        super(left, "|",right);
    }
    @Override
    public String literals() {
        return this.getExpression1().literals() + this.getExpression2().literals();
    }

    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitOr(this); 
    }

}
