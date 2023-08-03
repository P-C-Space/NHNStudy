package NHN2023_08_02_wed;

import static NHN2023_08_02_wed.Mathx.*;

public class FibonacciTest {

    public static void preCondition() { // 시작 전의 예외처리
        // if(fibonacci(-1)<0){
        // System.exit(1);
        // }
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        System.exit(1);
    }
    
    public static void postCondition() { // 리턴의 예외처리
        try{
            for(int i = 0;i<100;i++){
                System.out.println(i + " : "+ fibonacci(i));
            }
        }catch(ArithmeticException e){
            System.out.println("error : n is to big");
            return;
        }catch(StackOverflowError e){
            System.out.println("error : n is to big");
            return;
        }
        System.exit(1);
    }

    public static void baseCase() {
        if (!(fibonacci(0) == 0 && fibonacci(1) == 1)) {
            System.exit(1); // 1~255 -> 1 비정상종료
        } else {
            System.out.println("testBaseCase Test 완료");
            return;
        }
    }

    public static void recursionCase() {
        int[] answers = {3, 8, 15, 35};
        for (int index = 0; index < answers.length; index++) {
            if (!(fibonacci(answers[index]) == (fibonacci(answers[index] - 1)
                    + fibonacci(answers[index] - 2)))) {
                System.exit(1);
            }
        }
        System.out.println("testRecursionCase Test 완료");
    }

}
