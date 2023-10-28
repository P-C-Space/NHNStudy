package NHN2023_08_09_Wed.usecase;

import NHN2023_08_09_Wed.reuglar.*;

class RegularExpressionUtility{
    //public static String literals(Expression e){

    //}
}

public class RegularExpression {
    public static void main(String[] args) {


        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or( a.then( b ) );
        Expression ba_a0n = b.then( a ).or( Expression.EPSILON.or( a.star() ) );

        // System.out.println( a_ab );
        // System.out.println( Literals.of( a_ab ) );
        // System.out.println( ba_a0n );
        // System.out.println( Literals.of( ba_a0n ) );

        System.out.println(PrintableForm.of(a_ab));
        System.out.println(PrintableForm.of(ba_a0n));
    }
}
