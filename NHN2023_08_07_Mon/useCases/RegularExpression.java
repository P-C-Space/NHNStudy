package NHN2023_08_07_Mon.useCases;

import NHN2023_08_07_Mon.regular.*;

public class RegularExpression {
    public static void main(String[] args) {
        // Literal a = new Literal('a');
        // Literal b = new Literal('b');

        // Expression a_ab = new Or(a, new Then(a, b));
        // Expression ba_a0n = new Or(new Then(b, a), new Or(Expression.EPSILON, new Star(a)));
        // System.out.println(a_ab);
        // System.out.println(ba_a0n);

        /*
         * (a|(ab)) 
         * ((ba)|(ε|(a)*))
         */

        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.EPSILON.or(a.star()));

        System.out.println(a_ab);
        //System.out.println(Literals.of(a_ab));
        System.out.println(ba_a0n);
        //System.out.println(Literals.of(ba_a0n));
        /*
         * (a|(ab)) 
         * aab 
         * ((ba)|(ε|(a)*)) 
         * baa
         */
    }
}
