package Homework.visitor;

public interface Visitor {
    public void visitOr(Or e);

    public void visitThen(Then e);

    public void visitLiteral(Literal e);

    public void visitStar(Star e);
}
