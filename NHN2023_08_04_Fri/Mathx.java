package NHN2023_08_04_Fri;

import java.util.function.Predicate;
import java.util.function.BinaryOperator;

public class Mathx {
    public static int sum(int n) { // Overloading
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static <T> T reduce(BinaryOperator<T> binaryOperation, T init, T...numbers){
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    // public static double reduceIf(Predicate predicate,BinaryOperator binaryOperation,double init,double...numbers){
    //     double result = init;
    //     for (double number : numbers) {
    //         if(predicate.apply(number)){
    //             result = binaryOperation.apply(result, number);
    //         }
    //     }
    //     return result;
    // }

    public static <T> T reduceIf(Predicate<T> predicate,BinaryOperator<T> binaryOperation,T init,T...numbers){
        T result = init;
        for (T number : numbers) {
            if(predicate.test(number)){
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }



    public static long GCD(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    public static int[] addF(int[] numbers) {
        int[] result = new int[2];
        result[0] = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        result[1] = numbers[1] * numbers[3];
        return result;
    }

}
