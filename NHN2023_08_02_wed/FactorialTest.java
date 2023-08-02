package NHN2023_08_02_wed;

import static NHN2023_08_02_wed.Mathx.*;

public class FactorialTest {
    public static void preCondition(){
        try{
            factorial(-1);
        }catch(IllegalArgumentException e){
            System.out.println("error : input < 0");
            return;
        }
        System.exit(1);
    }
    
    public static void postCondition(){
        try{
            System.out.println(factorial(13));
        }catch(ArithmeticException e){
            System.out.println("error : n is to big");
            return;
        }catch(StackOverflowError e){
            System.out.println("error : " + e);
            return;
        }
        System.exit(1);
    }

    public static void baseCase(){

        assert factorial(0) == 1;

        // if(!(factorial(0) == 1)){ // 조건 충족 하지 않는다면 종료
        //     System.exit(1);
        // }
        // else{
        //     System.out.println("base Case Text 완료");
        //     return;
        // }
    }

    public static void recursionCase(){
        int[][] testNumber = {{3,6},{5,120},{7,5040},{10,3628800}};
        for(int i = 0;i<testNumber.length;i++){
            if(!(factorial(testNumber[i][0]) == testNumber[i][1])){
                System.exit(1);
            }
        }
        System.out.println("recursionCase Test 완료");
        return;
    }
}
