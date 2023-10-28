package Homework.visitor;

public interface Expression {
    Literal EPSILON = new Literal('ε');
    public void accept(Visitor visitor);
}
