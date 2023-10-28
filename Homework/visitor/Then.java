package Homework.visitor;

public class Then extends BinaryOperation implements Expression{

    protected Then(Expression left, Expression right) {
        super(left, "", right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitThen(this);
    }


}
