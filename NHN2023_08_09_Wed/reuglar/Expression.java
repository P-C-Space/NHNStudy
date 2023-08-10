package NHN2023_08_09_Wed.reuglar;


public interface Expression{

    Literal EPSILON = new Literal('ε');

    public default Expression or(Expression e){
        return new Or(this, e);
    }
    public default Expression then(Expression e){
        return new Then(this, e);
    }

    public default Expression star(){
        return new Star(this);
    }   
   
    public String literals();

    public void accept(Visitor visitor);
}