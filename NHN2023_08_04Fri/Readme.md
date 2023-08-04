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

```
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
```
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
```    
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
* 만약 같다면 같은 해시 값을 가져야 하기 때문에 eqauls를 사용할때 hashcode는 필수적이다.
![image](https://github.com/P-C-Space/NHNStudy/assets/39722575/16a3065b-4ce6-4647-8c72-940acb1b2d02)
