package Homework.interpreter;

public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal( 'b' );
        
        Expression a_ab = new Or( a, new Then( a, b ) );
        Expression ba_a0n = new Or( new Then( b, a ),
                new Or( Expression.epsilon, new Star( a ) )
        );
        System.out.println( a_ab );
        System.out.println( ba_a0n );
    }
}
