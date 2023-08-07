## 2023/08/03
* sum 문제 해결 - sum(x, y)가 x + y인지 x~y까지 모두 더하는 건지 구별하지 못하는 문제
```java
static void sum(x, y){
    return (x + y) * (y - x + 1) / 2
}

static void sum(x, y){
    return x + y;
}
```

### Data
* 연산의 집합

### Data Abstraction 데이터 추상화
* 구현하고자 하는 프로그램이 어떤 종류의 객체들로 구성되는지 파악
* 객체들이 갖는 데이터가 무엇인지, 수행하는 무엇인지 찾아낸다.

### Invariant
#### Type Invariant (타입 불변성)
* 데이터 타입에 대한 제약 조건
* 특정 데이터 타입이 가져야 하는 조건이나 규칙 지정 

#### Class Invariant (클래스 불변성)
* 클래스의 객체가 생성되고 사용되는 동안 유지되어야 하는 조건
* 클래스의 객체가 항상 일관된 상태를 유지해야 함을 보장
* 클래스의 인스턴스 변수들 사이에 유지되어야 하는 제약 조건

#### ex)
```java
    private int lower, upper;

    public Range(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        Invariant();
    }

    public void Invariant(){
        if (this.lower > this.upper) {
            throw new IllegalArgumentException("Range : "+ this.lower + ">" + this.upper);
        }
    }
```
### Abstraction barrier
* 모듈 간의 결합을 줄임
* 정보으닉
#### private 사용 이유
* 캡슐화 및 정보 은닉
* 안정성과 견고성
  * 잘못된 값이나 상태로부터 보호
* 유지보수와 변경 용이성
  * 내부 구현에 영향을 미치지 않으므로 유지보수 및 변경이 용이함
#### selectors, modifiers - getter(불러오기), setter(값을 변경)
* private의 내부 변수에 접근하기 위한 함수
* selectors/accessors = getter
* modifiers/mutator = setter

### Return의 배열을 반환 이유
* java에서는 heap영역에 존재 전에 언급하였던 reference value에 해당
* 자료 타입의 그룹화
* 동적 크기의 변환
  * 크기가 동적으로 변환되는 경우 유용
* 메모리의 효율성
  * 연속적으로 저장하기 때문에 효율적임
* 코드의 단순성
  * 코드의 단순성이 높아짐


### Stack
* empty stack 생성 -> constructor