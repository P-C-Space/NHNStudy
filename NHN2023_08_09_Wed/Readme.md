## 2023_08_09

### visitor pattern
* 객체 구조를 만들고 독립적으로 연산 수행하고 싶을때 활용
  * 객체 구조와 객체에 대한 연산을 분리
  * 개방폐쇄의 원칙 유지  
```java
interface Top {
  default void accept(Visitor v) {
    v.visit( this );
  }
}

class Left implements Top {
}

class Right implements Top {
}
```
* 다음과 같은 코드는 v.visit(this)에서 this는 Top이기 때문에 하위 코드 방문 x
```java
public interface Top {
  public void accept(Visitor v);
}


public class Left implements Top{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
   }
}

public class Right implements Top{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
   }
}
```
* 해결책
  * this을 호출 위치 변경

### String StringBuf StringBuilder
* String - 불변, 안전
* StringBuf - 가변, 안전
* StringBuilder - 가변, 불안전

* Partition Type에 연산을 추가할 때 사용
  * 교집 합 없음
  * 모두를 합치면 전체


### 복귀
### 계산 젗라에서 같은 부분을 솎아 올려서 코드 쓰임새를 늘리는 설계 공부 (Procedural Abstraction) 
#### sum > product > reduce, functional interface / lambda expression 으로 function (named closure) parameter로 넘기는 공부
  * Ad hoc polymorphism - Overloading
  * parametric polymorphism -> (generic methods)
#### 유리수 Fractional Data Type 설계하는 공부, 
  * class/type, 
  * type = { operations }, 
  * type definition = a set of primitive ops
  * abstraction (what/how) barrier
  * class invariant
  * how = implementation/representation
  * ctor/selector(getter)/modifier(setteR)/predicate 
  * equals, reference semantics vs value semantics
  * parameter passing - call by value
#### fibonacci, factorial 같은 recursion (induction) : Testing, Process Visualization
  * recursive structure에 바탕을 둔 test-first code
  * process 전개되는 지를 보고 order of growth
    * linear process, tree process
    * procedure vs process
#### Regular Expression (abstract)class, interface : Software Design
  * subtyping polymorphism
  * subtyping vs subclassing, LSP
  * interpreter, Visitor Pattern들이 type을 보태거나 op을 보태거나 sw를 늘리거나 고치는 데 어떤 문제를 푸는데 유리한가
  * dynamic dispatch - RTTI, method overriding = single dispatch

* Programming in the Large