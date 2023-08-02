package practice;

public class MathxTest { // name space
    // PrintArgs -> 변수
    // 값 -> {함수 안에 모든 것}
    // 타입 -> class
    // Life Time -> 이 프로그램 실행 시간

    //
    // private static int reduce(BinaryOperation binaryOperation,int init,int...numbers){
    // int result = init;
    // for (int number : numbers) {
    // result = binaryOperation.apply(result,number);
    // }
    // return result;
    // }

    // private static int sum(int...numbers){
    // return reduce(new Product(),0,numbers);
    // }


    private static double sum(double... numbers) {
        return Mathx.reduce(new Plus(), 0, numbers);
    }


    // call by value
    static int sum(int n, int m) {
        // return ((m-n + 1) * (m+n)) / 2;
        return sum(m) - sum(n - 1);
    }

    // sum :: int -> int
    static int sum(int n) {
        return (n * (n + 1)) / 2;
    }

    // sum :: (int,int) -> int
    static double sum(double x, double y) {
        return x + y;
    }

    // call by reference
    // static double sum(double... numbers){ // type signature
    // numbers => dynamic scope -> local
    // 지역 변수와 매개변수 차이점 (s 와 numbers)
    // 둘다 local이지만 s => static | numbers => dynamic
    // double s = 0;
    // for(double i : numbers){
    // s += i;
    // }
    // return s;
    // }

    // 변수 = (이름, 값, 범위(scope, 시계), 타입(저장 공간(크기), 값의 해석), 주소?, Life Time (라이프 타임) )
    // 이름이 (..) 간추린다. abstraction한다. -> 이름을 붙이는 행위
    // 바인딩 -> 메모리를 연결 시켜 주는 것
    // static 바인딩 -> 실행 전에 결정 -> static scope라기도 함
    // dynamic 바인딩 -> 실행 후에 변동됨 -> dynamic scope
    public static void main(String[] args) {

        // javac practice\MainTest.java -> class파일 생성
        // java practice.MainText 1 2 3 4 -> 실행 1, 2, 3, 4 출력

        // for (String arg : args) {
        // System.out.print(arg + " ");
        // }
        // System.out.println();

        // System.out.println("args length : " + args.length);

        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        // System.out.println(args[4]);

        // int result = 0;


        // int index = 0;
        // System.out.println(args[index]);


        // for문
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(args[i]);
        // }

        // while 문
        // while(index < args.length){
        // result += Integer.valueOf(args[index]); // concatenation 문자열 연결
        // System.out.println(args[index++]);
        // }
        // System.out.println(result);


        // double result = 0;
        // int index = 0;

        // while (index < args.length) {
        // result = result + double.valueOf(args[index++]);
        // result = sum(result, Double.valueOf(args[index++]));
        // }
        // System.out.println(result);



        // double result = 0;
        // int index = 0;
        // while(index < args.length){
        // result = sum(result,Double.valueOf(args[index++]));
        // }
        // System.out.println(result);

        // System.out.println(sum2(args));


        System.out.println("args의 길이는 " + args.length);
        int index = 0;

        double[] numbers = new double[args.length];

        for (String s : args) {
            numbers[index++] = Double.valueOf(s);
        }


        // System.out.println(sum(numbers));
        System.out.println(sum(2, 3));
        System.out.println(sum(3, 4, 5, 6, 7));
        System.out.println(sum(10) == sum(1, 3, 2, 5, 4, 6, 8, 7, 9, 10));
        System.out.println(sum(1, 10));
        // BinaryOperation plus = new BinaryOperation() {
        //     public double apply(double x, double y) {
        //         return x + y;
        //     }
        // };
        // System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4));

        System.out.println(Mathx.reduce((x, y) -> x + y, 0, 1,2,3,4));

        BinaryOperation minus = new BinaryOperation() {
            public double apply(double x, double y){
                return x - y;
            }
        };

        System.out.println(Mathx.reduce(minus,1,3,4,5,6));
        System.out.println(Mathx.reduceIf(x -> true,(x,y) -> x / y, 10, 1,2,5));


        // MAthx main
        System.out.println(Mathx.product(2, 10));
        double[] numbers2 = new double[10];
        for(int i = 0;i<numbers2.length;i++){
            numbers2[i] = i+1;
        }


        System.out.println("double : " + Mathx.product(numbers2));
        System.out.println("args : " + Mathx.product(args));

        System.out.println(Mathx.product(new double[]{10,30}));
        System.out.println(Mathx.product(3,4,5,6,123));
        System.out.println(Mathx.product(4,5,6));
        System.out.println(Mathx.product(3,5));

        System.out.println(Mathx.reduceIf(x -> x % 2 == 0,(x,y) -> x*y,30000000,1,2,3,4,5,6));
    }
}

// 자바는 call by value로만 작동
// 원시 타입 -> stack에 변수와 값을 동일시하게 생성 -> 우리가 흔히 아는 call by value

// 참조 타입 -> stack에 변수를 선언 heap에 값을 선언 -> 그렇다면 어떻게 작용하는가?
// a -> 1일 때 a는 stack 1은 heap
// b를 새로 생성하여 a가 1를 가리키는 값과 동일한 값을 b에 복사
// heap공간에서 값을 변경하면 a와 b는 가리키기만 하기 때문에 동일하게 변경됨
// 이 과정에서 heap공간에 값은 reference count라는 값을 가지며 1 -> 2 로 a -> a,b로 되어가는 과정을 거친다.
// 이 떄 아무도 참조하지 않는다면 참조 카운트는 0을 가지며 가비지 컬렉터에게 수집대상이 된다.
