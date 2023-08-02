package NHN2023_08_02_wed;

public class MathxTest {
    private MathxTest() { // default constructor

    }

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition(); // require
    }

    public static void main(String[] args) {
        // System.err.println(Mathx.fibonacci(5));
        MathxTest.fibonacciTest();
    }

}
