package NHN2023_08_04_Fri;

import java.util.function.*;

public class FractionalTest {
    private FractionalTest() {}



    public static void main(String[] args) {
        Fractional[] rs = {new Fractional(4, 8), 
            new Fractional(2, 4), 
            new Fractional(2, 3),
            new Fractional(1, 2),
            new Fractional(1, 3),
        };

        // for (Fractional r : rs) {
        //     System.out.println(r);
        //     System.out.println("double value : " + r.doubleValue());
        //     System.out.println("float value : " + r.floatValue());
        //     System.out.println("int value : " + r.intValue());
        //     System.out.println("long value : " + r.longValue());
        // }   
        Predicate<Fractional> ok = x ->true;

        System.out.println(Mathx.reduceIf(ok, Fractional::add, rs[0],rs[1],rs[2],rs[3]));
        System.out.println(Mathx.reduceIf(x->true, (x,y) ->x+y, "", "a","b"));
        System.out.println(Mathx.reduce((x,y) -> x+y, "", "a" ,"b","c"));
    }


}
