package Homework.visitor;

public class Literal implements Expression{
    private char c;

    public Literal(char c){
        this.c = c;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLiteral(this);
    }

    public char getC() {
        return c;
    }


    
}
