package Homework.lambda;

public class Test {
    public static void main(String[] args) {
        double []numbers = {2,3,4,5,6,7,8,9,10};
        System.out.println(Mathx.reduce((x,y) -> x * y, 1,numbers ));
        System.out.println(Mathx.reduce(new BinaryOperator() {

            @Override
            public double apply(double x, double y) {
                return x * y;
            }
            
        }, 1,numbers ));
        System.out.println(Mathx.reduce(new Plus(), 1,numbers ));
    }
}
