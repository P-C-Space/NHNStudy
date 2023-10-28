package NHN2023_08_01_Tue_remain;

public class MathxTest {
    public static void main(String[] args) {



        System.out.print("reduce : ");
        BinaryOperation divide = new BinaryOperation() {

            @Override
            public double apply(double x, double y) {
                return x / y;
            }

        };
        System.out.println(Mathx.reduce(divide, 100, 2, 2, 2));

        System.out.print("reduceIf : ");
        System.out.println(Mathx.reduceIf(x -> true, new BinaryOperation() {
            @Override
            public double apply(double x, double y) {
                return x - y;
            }
        }, 10000, 10, 1, 1, 12, 125, 215, 743, 713, 4, 64, 12, 64, 26, 246, 1));

        System.out.print("reduceIf2 :");
        System.out.println(Mathx.reduceIf(x->x%2 == 0, new BinaryOperation() {
            @Override
            public double apply(double x,double y){
                return x * y;
            }
        }, 1,2,3,4,5,6));

        System.out.print("sum 매개변수 1 : ");
        System.out.println(Mathx.sum(10));
        System.out.print("sum 매개변수 2 : ");
        System.out.println(Mathx.sum(5, 10));

        System.out.print("args : ");
        System.out.println(Mathx.sum(args));
    }
}
