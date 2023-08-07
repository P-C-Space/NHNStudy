### 2023_08_07

### Polymorphism 다형성
* 인터페이스나 기능을 다양한 방법으로 구현하거나 표현하는 능력
#### subtype polymorphism
* 상위 타입으로 선언된 변수가 하위 타입의 객체를 참조할 수 있는 능력
* 동물 - 강아지(is-a)

#### SOLID 원칙 - Liskov Substitution Principle(LSP, 리스코프 치환 원칙)
* 자식 클래스는 언제나 부모 클래스로 대체 가능
  * 하위 타입은 상위 타입의 기능 사용할 수 있어야 한다.

#### Ad hoc polymorphism
* 함수 오버로딩
  * 
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

```
### Collection
* set, map, array, queue, linkedlsit...
* 데이터 저장의 목적
  
### iterable & iterator
```java
// 배열밖에 못들어옴
for(int i = 0; i <numbers.length; i++){
    numbers[i];
}  

// collection이 들어올 수 있다
for(int i : numbers){
    i;
}
```
#### iterator
* 컬렉션의 내부 구현을 숨기고 안전하게 요소를 반복하기 위해 사용

### Interpreter Pattern
* 디자인 패턴 중 하나로, 언어 해석기를 구현하는데 사용되는 패턴
* 특정 언어의 문법을 정의하고 해석하여 언어의 문장을 실행하는 인터프리터를 구현하는데 도움이 됩니다
* AST 기반으로 구현
#### Interpreter
* 프로그래밍 언어를 싱해하는 방법 중 하나
  * 소스 코드를 직접 기계어로 변환하지 않고, 한줄씩 읽어가며 해당 언어의 문법을 해석하고 실행 - 즉시 실행
* 중간 단계의 기계어나 중간 코드 생성하지 않고 원시 코드를 바로 실행
### abstract synatax tree 추상 구문 트리 AST
* 프로그래밍 언어의 소스 코드를 파싱하여 추상화된 구문 트리로 변환하는 작업의 결과물

### 정규 표현식 Regular Expressions
```
R = ∈
    |문자|(r1|r2)
    |(r1,r2)
    |(r)*
    |여기서 r1,r2,r ∈ R
```
```
Expression = Epsilon                       => constructor
            |Literal(char)
            |Or(Expression, Expression)
            |Then(Expression, Expression)
            |Star(Expression)
```
|정규식표현|설명|
|---------|----------------------------------------|
|[]|한자리|
|[abc]|한자리에 a, b, c 사용 가능|
|^a|a로 시작하는 단어|
|[^abc]|a, b, c를 제외한 한 글자|
|a$|a로 끝나는 단어|
|a-z|a부터 z까지|
|a \| b|a or b|
|01(0\|1)| 010(o),011(o),012(x)|
|a{3}| a의 3번 반복|
|\b|공백, 탭, ",", "/"을 의미|
|\B|\b의 부정|

### class interface
* 인터페이스 내 public static final 고정
* 인스턴스마다 독립적으로 존재 해당 필드를 인스턴스 없이 접근하기 위해서는 public static 를 사용해야 함.
```java
public class Expression {
    public static (final) Literal epsilon = new Literal('ε');
}
```

```java
public interface Expression {
    Literal epsilon = new Literal('ε');
}
```

### 상수의 클래스화
* 싱글톤 패턴으로 변환
#### 문제점 - Thread Safe
* 이와 같은 싱글톤 패턴은 다음과 같은 문제가 있다.
  * 멀티스레드 환경에서의 문제
```java
public final class Epsilon implements Expression{
    private static Epsilon instance = null;

    private Epsilon(){}

    public static Epsilon getInstance(){
        if(instance == null){
            instance = new Epsilon(); // 스레드 충돌
        }

        return instance;
    }
}
```
* 해결책 - critical section
```java
public final class Epsilon implements Expression{
    private static Epsilon instance = null;

    private Epsilon(){}

    public static synchronized Epsilon getInstance(){
        if(instance == null){
            instance = new Epsilon(); // 스레드 충돌
        }

        return instance;
    }
}
```
* 하지만 이와 같은 방법은 synchronized를 사용함으로써 자원을 사용하게된다.
* 이와 같은 방식은 상수로 변환하면 된다.
```java
public class Expression {
    public static (final) Literal epsilon = new Literal('ε');
}
```

### abstract class vs interface
* 추상 클래스는 공통된 클래스들을 묶어서 상위클래스로 만들기 위한 역할 -> 일반화
* interface는 개별적 역할을 하는 확장역할이다. -> 확장
* 우리가 알고 있는 동물 -> 사람, 강아지 구조에 다른 새로운 동작에 대한 묶음을 처리하기 위한 자식클래스에 대한 개별적 상속으로 인터페이스를 사용한다. 이로써 보다 구조화시킨 객체지향 설계를 만들어낼 수 있다
* 또 다른 이유로는 이미 구현된 동물 -> 사람, 강아지의 구조가 보다 더큰 트리 형태로 상속을 받는다면, 추상클래스에 대한 변경은 치명적이다. 이때 개별적으로 묶어 처리하면서 기존의 것들을 유지하고 기능을 추가할 수 있는 개방폐쇄의 원칙도 지킬 수 있다.
#### abstract class
* 부모 -> 자식 - 복사 붙여넣기
#### interface
* type을 정의
* 연산(조건의 집합)
#### ex
* 그렇다면 Expression에 대한 코드는 어떤것을 사용해야 좋을까?
* 물론 겹치는 것이 있지만 사실상 의미는 개별적 역할을 한다. -> Interface사용 추천
* 굳이 사용하자면, 중복되는 멤버(변수)를 사용하는 것뿐이다. -> 추상 클래스 함수를 사용하기에는 개별적 함수가 존재하기 때문에 interface default사용이 바람직한 것으로 보인다.

#### abstract class 활용
* BinaryOperation 구현
```java
public abstract class BinaryOperation implements Expression {
    private Expression expression1;
    private Expression expression2;
    private String operator;

    protected BinaryOperation(Expression left, String string, Expression right) {
        expression1 = left;
        expression2 = right;
        operator = string;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "(" + getExpression1() + getOperator() + getExpression2() + ")";
    }
}

```
* 상속 사용 1
```java
public final class Or extends BinaryOperation {
    public Or(Expression left, Expression right) {
        super(left, "|", right);
    }
}
```
* 상속 사용 2
```java
public final class Then extends BinaryOperation {
    public Or(Expression left, Expression right) {
        super(left, "", right);
    }
}
```

### Subtyping 하위 유형화
* A와 B가 서로 서브타입
* A는 B, B는 A로 취급될 수 있다. -> 대체 될 수 있다.
### Subclassing 하위 클래스화
* 사람 -> 학생 클래스를 상속 사람의 모든 속성과 메서드 상속 받고, 추가적으로 학생 클래스의 속성과 메서드를 정의하여 사용한다.
* 이 떄 subtyping의 관계가 형성(강제적)