package NHN2023_08_09_Wed.reuglar;

public class Literal implements Expression{
    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return String.valueOf(getCharacter());
    }

    @Override
    public final String literals(){
        return "";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLiteral(this); 
    }
}
