package NHN2023_08_02_wed;

public class Mathx {
    private Mathx() {
    }
    public static int fibonacci(int n) {
        if(n < 0){
            return -1;
        }
        // base condition - 계산이 끝나는 지점 ----------------
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1; 
        }
        // ---------------------------------------------------
        return fibonacci(n-1) + fibonacci(n-2); // recursion case
    }

}
