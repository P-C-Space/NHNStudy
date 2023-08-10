package NHN2023_08_09_Wed.reuglar;

public interface Visitor {
    public void visitEpsilon(Epsilon e);

    public void visitLiteral(Literal e);

    public void visitThen(Then e);

    public void visitOr(Or e);

    public void visitStar(Star e);

}
