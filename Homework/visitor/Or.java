package Homework.visitor;

public class Or extends BinaryOperation implements Expression{

    protected Or(Expression left, Expression right) {
        super(left, "|", right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOr(this);
    }

    
}
