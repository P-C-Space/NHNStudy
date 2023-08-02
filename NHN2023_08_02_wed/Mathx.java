package NHN2023_08_02_wed;


public class Mathx {
    private Mathx() {}

    public static int fibonacci(int n) {
        if (n < 0) {
            // throw new ArguementException("fibonacci : n < 0");
            throw new IllegalArgumentException("fibonacci: n < 0");
        }

        // base condition - 계산이 끝나는 지점 ----------------
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // ---------------------------------------------------
        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2)); // recursion case
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("factorial: n < 0");
        }
        if (n == 0) {
            System.out.println("factorial(0) = 1");
            return 1;
        }
        System.out.println(n + " * " + "factorial(" + (n - 1) + ")");
        int result = Math.multiplyExact(n, factorial(n - 1)); // 기존 return의 역할
        
        System.out.println(n + " * " + "factorial(" + (n - 1) + ")");
        return result;
        // return Math.multiplyExact(n, factorial(n - 1));

        // return n == 0 ? 1 : Math.multiplyExact(n, factorial(n-1));
    }
}
