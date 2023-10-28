package Homework.visitor;

public class Star implements Expression {

    private Expression e;
    public Expression getE() {
        return e;
    }


    public Star(Expression e){
        this.e = e;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitStar(this);
    }

}
