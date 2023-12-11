## 2023/08/04
* Data type => 연산의 집합

<br>

* Constructor -> 기계가 x 만드는 역할 
* 나머지 함수들은 기계가 만들고 난 x 후처리 역할

<br>

* class 이름 - 연산을 묶어서 붙인 이름
* 이름 -> 특징들을 표현하기 위해 간단히 표현하는 역할

### Object Oriented Programming(OOP)
* 같은 의미의 코드

```
// 문법적 장난
move(circle, point(x,y)) -> f(a, b, c)
circle move : point(x,y) -> a.f(b, c)
circle.move(point(x,y))
```

* 자바 스타일 코드 projection

```
(name, gender, age) = person
person.name

```
### 선언과 정의

#### 선언
* 선언은 메모리 할당 or 초기화 X
* 선언을 함으로써 이름을 명확하게 표시 -> 사용될 것을 의미(변수명으로 어떻게 사용할 지 추측)
* 데이터 타입 -> 어떤 값 메모리를 할당할지 알려줌

#### 정의
* 정의는 메모리 할당 및 초기화 실행 
* 미리 선언했던 object에 메모리와 값을 할당

```java
public class Fractional {
    // 선언
    private int numerator;
    private int denominator;
  
    public Fractional(int numerator, int denominator){
        // 정의
        this.denominator = denominator;
        this.numerator = numberator;
    }
}
```
### How to design a type
* 모든 변수(데이터 타입)는 extends java.lang.Object 한다.
```
public class Fractional extends java.lang.Object{}
```
#### (1) Primitive operation to define a (data) type (set)
* ADT(abstract data type) 추상 자료형 where primtives = abstraction barrier
  * 데이터, 연산, 인터페이스, 구현 구성요소
#### (2) combinations (combinational operation) 
* e.g add, multiply...

#### equals
* java.lang.Object를 extneds 하기 때문에 Object형식으로 받는다.
* 같은 타입의 비교
* 기본 생성한 코드
```java
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numerator;
        result = prime * result + denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fractional other = (Fractional) obj;
        if (numerator != other.numerator)
            return false;
        if (denominator != other.denominator)
            return false;
        return true;
    }
```
* 변경한 코드 기존의 isEqual를 이용
  * instanceof - 객체 타입 확인
```java    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fractional))
            return false;
        Fractional other = (Fractional) obj;
        return this.isEqual(other);
    }

    public boolean isEqual(Fractional that) {
        if (this == that)
            return true;
        if (that == null) 
            return false;
        return (this.denominator() * that.numerator() == (this.numerator() * that.denominator()));
    }

```
#### Hash Code
* 이 때 해시코드는 객체의 구별을 위해 사용된다.
* 동등한 객체는 동등한 해시 코드를 가져야 한다.
* 이와 같은 이유로 equals를 사용할 떄 두 객체가 같은지 비교한다.
* 만약 같다면 같은 해시 값을 가져야 하기 때문에 eqauls를 사용할때 hashcode는 필수적이다. (값이 같더라도 해시값이 다르면 다르다.)
![image](https://github.com/P-C-Space/NHNStudy/assets/39722575/16a3065b-4ce6-4647-8c72-940acb1b2d02)

#### 해시 충돌 해결
* 연결리스트, 개방 주소법
### getNumberator, getDenominator
* 유리수에 한해 설정한 값의 비가 같아야 하기 때문에 중간에 수정이 불가함. -> getter만 존재

###  Generic T
* o의 타입을 알지 못한다. 
* 모두 비교하는 것은 거의 불가능
```java
class Stack{
    public stack(){};
    public Stack push(newElem){};
    public Stack pop(){};
    public Top(){};
}

public static void main(String[] args) {
    Stack s = new Stack();
    s.push(new Integer(0));
    s.push(new String(""));
    Object o = s.pop();
}
```
* 따라서 Generic T를 사용 한가지 타입을 사용한다.
```java
class Stack<T>{
    public stack(){};
    public Stack push(T newElem){};
    public Stack pop(){};
    public Top(){};
}

Stack<String> s;
```
* 제약 조건도 가능하다.
```java
class Stack<T extends java.lang.Number>{
    public stack(){};
    public Stack push(T newElem){};
    public Stack pop(){};
    public Top(){};
}
```

### Object
```java
public class Test {
    public static void main(String[] args) {
        String s = new String("");
        Object o = s;
        System.out.println(s == o); true
        String s2 = (String)o;
        System.out.println(s2 == o); true

        int x = 4;
        Integer y = new Integer(x);
        System.out.println(x == y); true
    }
}

```
* 주소 비교 => 객체가 같음
#### Integer vs int
* int
  * 32비트 정수 값을 저장하는 기본 데이터 타입
  * null 불가, 메모리에 직접 값을 저장 
  * 객체 생성 소멸에 관련된 오버헤드가 없음
* Integer
  * int를 감싸는 wrapper클래스 int을 객체로 포장
  * 객체의 생성과 메서드 호출 가능
  * null 포함 다양한 값을 가진다
  * int에서 Integer변환에 Auto-boxing으로 변환 발생

### boxing
* [value, reference] java에서는 stack과 heap공간 분리
* 접근하기 위해서 wrapper class 적용
* wrapper class 최상위 클래스 Number
* 접근 하기 위해서 감싸는 행위를 boxing이라고 함
* 반대로 unboxing

### Life Time (heap, stack)
* heap -> Life Time Vm이 정함
* Stack -> 블록과 함께.. 최소한 이름 소멸

### Semantics 의미론
#### value
* 값의 내용에만 의존하여 동등성 판단
* 값의 불변성 유지
* 대신 값을 복사
* String
#### reference
* 저장된 메모리 주소에 의존하여 동등성 판단
* 값 자체는 변경 가능
* 메모리를 공유하므로 복사는 발생 x
* 불변성 보장을 하지 않음
* Object와 Array

### 전산학에서의 Environment
```java
    int x = 4; // {(x, 4)}
    int y = 5; // {(x, 4), (y, 5)} = r => Enviroment
```
* 이름과 값의 집합
* 무언가를 해석할 수 있는 문맥을 Environment or context라고 한다.
* Frame들의 트리
#### 클로저 Closure
* 특정 함수와 함수가 참조하는 환경(environment)의 조합
```java
    // {5 + 4}r => Closure
```
#### Statement
* Enviroment의 변화
```java
    //  => {y + x}r     time1
    // {5 + x}r
    // {5 + 4}r
    // 9r => {y = 9}r   time2
```
* 시간에 따른 기록으로 순서가 생김

#### Frame
* 매 블록마다 Frame이 생김
* Frame의 나무가 Environment이다

```java
public class Environment {
    public static void main(String[] args) {
                    // 코드와 코드해석의 쌍이 (closure)
                    // closure를 가지고 계속해서 줄여나가는 것을 (reduction) (evaluation)
                    // 무언가를 해석할 수 있는 문맥을 Environment or context라고 한다.
        int x = 4; // {(x, 4)}
        int y = 5; // {(x, 4), (y, 5)} = r
        y = y + x; // {y + x}{코드를 해석할 수 있는 Environment가 따라다님(x,4),(y,5)} 
                    //  => {y + x}r
                    // {5 + x}r
                    // {5 + 4}r
                    // 9r => {y = 9}r
                    // 이 때 Enviroment의 변화(Statement) => r' = {(x,4),(y,5)} 
                    // 이떄 변화를 기록하기 위해(r') 시간을 기록하며 순서가 생긴다.
        {
            int z = 3; // {(z,3)} + r' 새로운 z의 추가
            int y = 4; // {(z,3),(y,4)} + r' 집합을 나눔
            // Frame -> 매 블록마다 Frame이 생김
            // Frame들의 나무 -> Environment -> binding의 집합
            y = x; // {(z,3),(y,4)}에 존재하지 않음 상위나무로 -> r' => {(x,4),(y,5)}
            // 다시 기존의 트리에 영향을 주기 때문에 시간에 영향을 받아 r'' = {(z+3),(y+4)} + r'으로 저장
        }
    }
}
```
