### 2023-08-10
### To-do List

- [ ]  Matcher라는 (정규표현 → 문자열) Visitor subtype 개발
    
    Expression e = new Matcher(”[a-z][a-zA-Z0-9]*”)
    
    Match v = new Matcher(e);
    
    v.match(”45e”) → false
    
- [ ]  Visitor<T>에서 Literals 방식으로 개발
    
    public final class Literals implements Visitor<String> {}
    
- [ ]  [Mathx.java](http://Mathx.java) → reduceIf 함수에서 Array 대신 iterator 사용하여 확장하기
    
    ArrayList 모두 더한 값
    
- [ ]  **reduceIf iterator version 코드를 놓고, BinaryOperation subtype으로 풀 수 있는 문제**

# 시험공부 범위
## 전산 기초
* 문제 푸는 방법, recursion으로 설계한 해법을 induction으로 증명하듯이 Test 코드 구조를 설계하는 방법으로 recursion은 아주 쓸모가 많음
### test-first programming
#### fibonacci, factorial 같은 모두가 한 번씩 다 만들어본 recursion(induction)은 어떻게 induction 구조로 Testing하는가. 그게 왜 좋지?
> 전체적인 반복문에서 재귀함수로 알고리즘의 간결함, 가독성이 높아지지만 스택의 호출로 인해 오버헤드, 메모리사용 문제에 성능 저하가 있을 수 있다.
    
#### Procedure의 pre/post condition은 왜 필요하지? 
* precondition - 입력값에 대한 예외 처리
> 자연수 값을 처리하는 자료형에 대해 다른 자료형이나, 음수, 실수 등이 들어오는 것에 대해 예외처리를 해주지 않으면 오류나 개발자가 원하지 않는 방향으로 실행될 수 있다. 
* post condition - 출력값에 대한 예외 처리
> 실행 후의 값이 담을 수 있는 자료형을 초과할 수 있으므로 그에 대한 예외처리다. 즉, 계산 후의 값을 int에 저장하려고 할 때 초과한 값이 들어온다면 ArithmeticExceptionn가 발생한다. 

#### argument/return value의 type과는 무슨 관계가 있지?
* Argument
    * 함수나 메소드에 전달되는 값(value)
* Type
    * 데이터의 범위 => 메모리 할당 구조
    * 연산 및 동작 규칙
> argumetn value와 return value가 일치해야 함수가 올바르게 작동하고 예상되는 결과를 제공받을 수 있다.
<br>예를 들어 정수형으로 받고 곱한 후에 실수형으로 리턴하거나 실수형으로 받고 정수형으로 리턴할 경우 값은 변경으로 원하는 값을 받지 못할 수 있다.

### Process Visualization
* Procedure(Code)를 돌려보면 계산 과정(process)이 어떤 모양으로 펼쳐지는가.
> POP(Procedure Oriented Programming) 절차적 프로그래밍이 아닌 프로시저의 의미 => 우리가 흔히 말하는 절차지향은 struct구조체를 통해 멤버변수는 만들 수 있지만 멤버함수는 넣을 수 없으며, 멤버변수 또한 초기화 값을 담지 못하는 구조만 담은 형식이다. 이런 함수를 사용하기 위해 구조체 안의 함수는 함수포인터를 통해 가리킨다. 이는 구조체의 소속이 아니라는 것이며 누가 호출하였는지 알려줘야 하는 것이다.
```c
// 게임 함수 구현
void 공격(캐릭터* this, 캐릭터* 타겟) {
	타겟->체력 -= this->공격력;
	printf("%s가 %s를 공격\n", this->캐릭터명, 타겟->캐릭터명);
	printf("%s의 체력: %d\n", 타겟->캐릭터명, 타겟->체력);
}

void 사망(캐릭터* this) {
	printf("%s가 사망\n", this->캐릭터명);
	free(this);
}
```
> OOP(Object Oriented Programming) 객체 지향 언어로 클래스라는 강력한 기능으로 멤버변수를 가지며 초기화할 수 있다. 멤버 함수도 동일하며 클래스에 소속한다. 따라서 알려줄 필요없이 호출한 그 자체이다.

image
* procedure vs process : call stack
> 
* process 전개되는 지를 보고 order of growth
* linear process, tree process

### while, for같은 iterative control structure처럼 되풀이 계싼을 표현하는 수단으로 recursion을 익히는 것은 기술 대중이 즐겨 쓰는 Java를 비롯한 대부분의 프로그래밍 언어에서 거의 쓸모 없음

### method = function = procedure = named closure = (code enviroment) = (code, a tree-structured set of frames)

## Procedural Abstraction
* 계산 절차에서 같은 부분을 솎아 올려서 코드 쓰임새를 늘리는 설계 공부
### sum > product > reduce
* Ad hoc polymphism - overloading
> 다형성의 한 형태로 동일한 함수명을 가지고 여러 개의 다른 파라미터 타입을 받는 것
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
* software 인터페이스는 어떻게 설계하나 : 정수 범위를 정의하는 Range type(class)을 왜 만들어야 했나.
> 

* subtyping으로 여러 function(closure)을 넘기는 구조를 구현

* fuctional interface/lambda expression으로 function(named closure)을 parameter로 넘기는 공부 [lambda 이동]()
```java
@FunctionalInterface // 람다식 가능 - 한개의 추상 메소드만 가짐
public interface BinaryOperator{
    double apply(double x,double y);
}

public final class Plus implements BinaryOperator{

    @Override
    public double apply(double x, double y) {
        return x + y;
    }
    
}

public class Mathx {
    public static double reduce(BinaryOperator binaryOperation, double init,double...numbers){
        double result = init;
        for(double number: numbers){
            result = binaryOperation.apply(result, number);
        }
        return result;
    }
}

public class Test {
    public static void main(String[] args) {
        double []numbers = {2,3,4,5,6,7,8,9,10};
        System.out.println(Mathx.reduce((x,y) -> x * y, 1,numbers )); // lambda
        System.out.println(Mathx.reduce(new BinaryOperator() { // anonymous class

            @Override
            public double apply(double x, double y) {
                return x * y;
            }
            
        }, 1,numbers ));
        System.out.println(Mathx.reduce(new Plus(), 1,numbers ));
    }
}
```
* 출력
> 3628800.0 <br>
3628800.0 <br>
55.0
* anonymous class object > anonymous function > lambda expression
* parametric polymorphism (generic methods)

## Data Abstraction
> 사용자가 알 수 있는 기능(가속, 제동, 핸들 조작 등), 사용자가 알 필요 없는 기능(엔진 작동 원리, 가속 원리 등), 복잡한 데이터는 숨기고 간단한 모델로 단순화 
### Fractional Data Type을 설계하는 공부
* Data Type을 표현하는 수단이 없다면 어떻게 data abstraction하지?
* class vs .type
    * type = {operations}
    > 타입 -> 연산의 집합
    * type definition = a set of primitive ops
    > 타입 정의 = 원시 데이터 타입 셋
    * abstraction (what/how) barrier
    > 외부 사용자가 사용할 기능과 detail(private)한 내부 동작을 분리 
    * how = implementation/representation
    > implementation => 각각의 멤버함수, 멤버변수 등 작성(구현)하는 과정<br>
    > representation => 객체를 다른 형태로 나타내는 것 
    * type(class) invariant : testing objects
    > 불변성 -> 객체가 생성되고 사용되는 동안 유지되어야 하는 조건, 일관성


* abstract data type: how to design types
    * a set of primtives ops ctor/selector(getter)/modifier(setter)/predicate
    > selectors, getter (불러오기)
    > modifiers, setter (값을 변경)
    > private의 내부 변수에 접근하기 위한 함수
    > predicate - 참과 거짓을 반환하는 함수 및 표현식 조건판별식
    * equals (+ hash code)
    > 해시코드는 객체의 구별을 위해 사용된다.<br>
    > 동등한 객체는 동등한 해시 코드를 가져야 한다.<br>
    > 내부 값이 같으면 같은 해시 코드로 처리한다. 만약 값이 같더라도 해키코드가 다르다면 다른 것이다.
    * reference (pointer) vs value, stack vs heap, 
    > 자바는 call by value로만 작동하며 call by reference는 없다. <br>
    > call by value는 자바에서 stack에 변수와 함께 값을 선언하며 a = 1을 stack에 저장한다. <br>
    > call by reference는 자바에서 stack에 변수, heap에 값을 저장하며 a는 1의 주소값을 가지고 있다. <br>
    > 여기에 또 다른 변수 b가 똑같이 1의 주소값을 가지고 b가 값을 변경하는 경우 <br>
    > -> main함수에서 선언된 배열을 함수의 매개 변수를 넘겨주는 방식이다. <br>
    > 이때 reference count(참조 카운트)를 가지며 a, b => 2 후에 a, b가 삭제된다면 1을 아무도 가리키지 않기 때문에 0으로 garbage collector의 수집 대상이 된다.
    * reference semantics vs value semantics
    > value 값의 내용에만 의존하여 동등성 판단, 값을 불변성 유지, 값을 복사하는 특징이 있고
    > reference 저장된 메모리 주소에 의존하여 동등성 판단, 값 변경 가능, 복사 발생 x, 불변성 보장 x
    * paramter passing - call by value