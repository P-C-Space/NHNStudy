package Homework.visitor;


public class Test {
    public static void main(String[] args) {
        Literal a = new Literal( 'a' );
        Literal b = new Literal( 'b' );
        
        Expression a_ab = new Or( a, new Then( a, b ) );
        Expression ba_a0n = new Or( new Then( b, a ),
                new Or( Expression.EPSILON, new Star( a ) )
        );
        System.out.println( a_ab );
        System.out.println( ba_a0n );
    }
}
