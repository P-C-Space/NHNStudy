package exam;

import static exam.Mathx.*;

public class FibonacciTest {

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1)
            return;
        assert false;
    }

    public static void recursionCase() {
        int[][] answers = {{5, 5}, {6, 8}, {9, 34}, {14, 377}, {18, 2584}};
        for (int[] answer : answers)
            assert answer[1] == fibonacci(answer[0]);
        return;
    }

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        assert false;
    }

    public static void postCondition() {
        try {
            fibonacci(Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            return;
        }
        assert false;
    }

    public static void main(String[] args) {
        preCondition();
        baseCase();
        recursionCase();
        postCondition();
    }
}