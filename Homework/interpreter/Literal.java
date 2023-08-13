package Homework.interpreter;

public class Literal implements Expression{
    private char c;
    public Literal(char c){
        this.c = c;
    }
    public char getC() {
        return c;
    }
    @Override
    public String toString() {
        return String.valueOf(c);
    } 
    
}
