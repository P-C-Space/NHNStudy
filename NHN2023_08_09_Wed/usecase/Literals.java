package NHN2023_08_09_Wed.usecase;

import NHN2023_08_09_Wed.reuglar.*;

public final class Literals implements NHN2023_08_09_Wed.reuglar.Visitor {

    private StringBuilder literals = new StringBuilder();

    @Override
    public void visitEpsilon(Epsilon e) {}

    @Override
    public void visitLiteral(Literal e) {
        literals.append(e.getCharacter());
    }

    @Override
    public void visitThen(Then e) {
        e.getExpression1().accept(this);
        e.getExpression2().accept(this);
    }

    @Override
    public void visitOr(Or e) {
        e.getExpression1().accept(this);
        e.getExpression2().accept(this);
    }

    @Override
    public void visitStar(Star e) {
        e.getExpression().accept(this);
    }

    public static String of(Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiterals();
    }
    
    private String getLiterals(){
        return this.literals.toString();
    }
}
