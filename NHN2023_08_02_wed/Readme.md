## 2023/08/02

### constructor
* 지정하지 않는다면 - default constructor -> 기본 public 
* 보안상의 이유로 private로 변경
```
public class MathxTest {
    private MathxTest(){ // default constructor

    }
}
```
### recursion
* 자기 자신을 호출하는 방식으로 알고리즘일 뿐이다. 반면에 Recursive Process 재귀적 프로세스는 재귀적으로 실행되는 프로세스의 흐름이다.
* 
#### fibonacci
![image](https://github.com/P-C-Space/NHNStudy/assets/39722575/f22fa75d-14ef-4cef-a09c-46a4d19768e3)

```
    public static int fibonacci(int n) {
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
```

### 호출
* main -> os 호출
### Exception Hierarcy
![image](https://github.com/P-C-Space/NHNStudy/assets/39722575/fdfffa83-39e0-43cc-8aa8-c4ee3bff17ac)
### PreCondition
* 입력값에 대한 예외 처리
* RuntimeException의 상속 ArgumentException을 직접 구현 (자바의 IllegalArgumentException)
* 입력값 -1 일때 무한루프 문제 해결
```
    public static void preCondition() { // 시작 전의 예외처리
        try {
            fibonacci(-1);
        } catch (ArguementException e) {
            return;
        }
        System.exit(1);
    }
```
```
public class ArguementException extends RuntimeException {
    public ArguementException(String messsage) {
        super(messsage);
    }
}
```
### PostCondition
* 출력값에 대한 예외 처리
* StackOverflow및 범위 초과에 대한 ArithmeticException 예외처리
* fibonacci의 경우 47번째 수부터 factorial은 13번째 수부터 int 자료형 초과
```
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
```

### Math 함수와 일반 연산
* math에서는 int와 long에 대해서만 적용
#### 오류 처리(Exception handling)
#### Math
* n, m에 대하여 범위가 초과할 경우 ArithmeticExceptionn을 발생시킵니다.
* 즉 오버 플로우가 발생하면 예외가 발생하며, 정확한 연산 결과를 보장합니다.
#### 일반 연산
* 오버플로우를 검사하지 않아 부정확한 결과가 반영됨

* ex) 재귀식에서 기하급수적으로 늘어나는 수들에 적합하다.

### Assert
* 주석에 해당하는 부분 한줄로 해결
* 해당하는 줄이 true일 경우 진행
* flase일 경우 Exception 발생
* 다만 실행시에 java -ea 실행파일 or visual code의 setting을 변경해주어야 assert 코드가 실행이 된다. 
* 기본값 -> 해당 라인 무시
```
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
```

### Activation Record
* 함수가 호출될 때 생성되는 스택의 한 덩어리
* 호출되는 스택 -> Call Stack
* 각 함수는 고유한 Activation Record를 가진다.
* 호출되고 실행될때마다 생성 및 소멸한다.
#### 저장 정보
* Return Address 돌아갈 주소
  * 함수 종료 후 돌아갈 함수의 주소 저장
* Arguments 인자
  * 전달된 인자 저장
* Local Variables 지역 변수
  * 함수 내 선언된 지역 변수 저장
* Saved Registers 저장된 레지스터
  * 호출 전에 사용되던 레지스터들 저장
* Dynamic Link
  * 호출하는 함수의 Activation Record로의 포인터 저장
* Static Link
  * 정적으로 스코프되는 변수들에게 접근하기 위해 포인트 저장

#### ex)
*  이는 재귀함수 호출시 호출 깊이에 따라 Activation Record가 쌓이며 스택이 초과하면 이때 Stack Overflow발생
```
factorial(3)
3 * factorial(2)
3 * 2 * factorial(1)
3 * 2 * 1 * factorial(0)
3 * 2 * 1 * 1
6
```

### 계산 복잡도
* Big-O 최악
* Big-Ω 최고
* Big-θ 평균
![image](https://github.com/P-C-Space/NHNStudy/assets/39722575/327d5981-f45e-40c3-bfb1-1f28cc6854e7)

