package Homework.interpreter;

public class Star implements Expression{
    @Override
    public String toString() {
        return "(" + getE() + ")*";
    }
    Expression e;
    public Star(Expression e){
        this.e = e;
    }
    public Expression getE() {
        return e;
    }
}
