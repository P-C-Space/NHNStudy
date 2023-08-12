package Homework.lambda;

public class Mathx {
    public static double reduce(BinaryOperator binaryOperation, double init,double...numbers){
        double result = init;
        for(double number: numbers){
            result = binaryOperation.apply(result, number);
        }
        return result;
    }
}
