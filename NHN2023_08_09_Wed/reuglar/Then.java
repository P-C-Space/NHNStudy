package NHN2023_08_09_Wed.reuglar;

public class Then extends BinaryOperation implements Expression{
    public Then(Expression left,Expression right){
        super(left,"",right);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitThen(this); 
    }


    @Override
    public String literals() {
        return "";
    }
}
