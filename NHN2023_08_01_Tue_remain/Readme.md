## 2023/07/31 ~ 2023/08/01
### err vs out
* 코드
```java
System.out.println("3x3=") ;
System.err.println("9") ;
```
* 출력
> 9
> 3x3=

### out 
* 버퍼에 넣고 기다렸다가 적절한 타이밍에 한번에 출력(flush)
### err
* 크리티컬한 상황을 기록하기 위한 목적 때문에 거의 바로 출력flush

### 변수
* 이름, 값, 범위(scope, 시계), 타입(저장 공간(크기), 값의 해석), 주소?, Life Time (라이프 타임) 
* 이름이 (..) 간추린다. abstraction 한다. -> 이름을 붙이는 행위
* 클래스 명도 변수
* 클래스 변수는 값({내부의 값들}), 타입(class), Life Time

### 바인딩 
* 메모리를 연결 시켜 주는 것
* static 바인딩 -> 실행 전에 연결 -> static scope
* dynamic 바인딩 -> 실행 후에 변동 -> dynamic scope
### call by value
* 자바는 call by value로만 작동
* 이를 원시 타입과 참조 타입으로 나누며 원시타입(call by value), 참조타입(call by reference)
#### 원시 타입
* stack에 변수와 값을 함께 선언 a = 1
(stack내부에 a, 1)
#### 참조 타입
* stack -> 변수, heap -> 값
* a는 1의 주소값을 가리킴
* ex) 1를 가리키는 새로운 변수 b 생성 
* a와 b는 1을 가리키며 reference count (참조 카운트) 2에 해당
* 만약 a와 b가 사라진다면 1은 아무도 가리키지 않기 때문에 참조 카운트 -> 0 -> garbage 컬렉터 수집 대상

* numbers 와 s는 모두 local 변수
* 하지만 numbers dynamic이고 s 는 static으로 지정된다.
```java
static double sum(double...numbers){
    double s = 0;
    for(double i : numbers){
        s+=i;
    }
    return s;
}
```

### 람다식
* 이름 없는 함수
```
(x, y) -> x + y
```