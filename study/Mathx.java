package study;

public class Mathx {
    public static double reduce(BinaryOperation binaryOperation, int init, double...numbers){
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    public static double reduceIf(Predicate predicate,BinaryOperation binaryOperation,int init,double...numbers){
        double result = init;
        for (double number : numbers) {
            if(predicate.apply(number)){
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }
    
    public static double sum(double n, double m){
        return sum(m) - sum(n-1);
    }

    public static double sum(double n){
        return (n * (n+1)) / 2;
    }

    public static double sum(String...args){
        double result = 0;
        for (String s : args) {
            result += Double.valueOf(s);
        }
        return result;
    }

}
