package NHN2023_08_02_wed;

public class MathxTest {
    private MathxTest() { // default constructor

    }

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition(); // require
        FibonacciTest.postCondition(); // require
    }

    public static void FactorialTest(){
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    public static void main(String[] args) {
        // System.err.println(Mathx.fibonacci(5));
        // MathxTest.fibonacciTest(); // fibonacci 테스트
        // MathxTest.FactorialTest(); // Factorial 테스트  
        System.out.println("factorial(3)");
        System.out.println(Mathx.factorial(3));
    }

}
