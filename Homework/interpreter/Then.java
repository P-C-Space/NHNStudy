package Homework.interpreter;

public class Then implements Expression{
    Expression e1, e2;
    public Then(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public Expression getE1() {
        return e1;
    }
    public Expression getE2() {
        return e2;
    }

    @Override
    public String toString(){
        return "(" + getE1() + getE2() + ")";
    }
}
