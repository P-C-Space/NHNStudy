package NHN2023_08_05_Mon.regular;

public interface Expression {
    Literal EPSILON = new Literal('ε');

    public default Expression or(Expression e){ // 개방 폐쇄의 원칙 => default
        return new Or(this, e);
    }
}


// public abstract class Expression{
//     public static final Literal EPSIlON = new Literal('ε');

//     public abstract Expression or(Expression e);

// }