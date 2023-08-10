package NHN2023_08_09_Wed.usecase;

import NHN2023_08_09_Wed.reuglar.*;

public class PrintableForm implements NHN2023_08_09_Wed.reuglar.Visitor {

    private StringBuilder print = new StringBuilder();

    public static String of(Expression e) {
        PrintableForm print = new PrintableForm();
        e.accept(print);
        return print.getLiterals();
    }

    private String getLiterals() {
        return this.print.toString();
    }

    @Override
    public void visitEpsilon(Epsilon e) {
        print.append("\u03B5");
    }

    @Override
    public void visitLiteral(Literal e) {
        print.append(e.getCharacter());
    }

    @Override
    public void visitThen(Then e) {
        print.append("(");
        e.getExpression1().accept(this);
        e.getExpression2().accept(this);
        print.append(")");
    }

    @Override
    public void visitOr(Or e) {
        print.append("(");
        e.getExpression1().accept(this);
        print.append("|");
        e.getExpression2().accept(this);
        print.append(")");

    }

    @Override
    public void visitStar(Star e) {
        print.append("(");
        e.getExpression().accept(this);
        print.append(")*");
    }
}
