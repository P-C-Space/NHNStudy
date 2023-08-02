package NHN2023_08_02_wed;

import static NHN2023_08_02_wed.Mathx.*;

public class FibonacciTest {

    public static void preCondition(){
        if(fibonacci(-1)<0){
            System.exit(1);
        }
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
