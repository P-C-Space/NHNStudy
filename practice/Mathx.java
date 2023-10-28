package practice;

public class Mathx {
    static double product(double x, double y) {
        return x * y;
    }

    // fold{right, left}, accumulate
    static double reduce(BinaryOperation binaryOperation,double init, double...numbers ){
        double result = init;
        for(double number : numbers) // Liskov's Substition Principle
            result = binaryOperation.apply(result, number);
        return result;
    }

    static double reduceIf(Predicate predicate,BinaryOperation binaryOperation,double init,double...numbers){
        double result = init;
        for(double number : numbers){
            if(predicate.apply((number))){
                result = binaryOperation.apply(result,number);
            }
        }
        return result;
    }

    public static double product (double...numbers){
        return reduce(new Multiply(),1,numbers);
    }

    // static double product(double...numbers){
    //     double sum = 1;
    //     for(double s : numbers){
    //         sum *= s;
    //     }
    //     return sum;
        
    // }

    static double product(String ...numbers){
        double result = 1;
        for (String string : numbers) {
            result *= Double.valueOf(string);
        }
        return result;
    }
    

    // public static void main(String[] args) {
        
    // }

}
