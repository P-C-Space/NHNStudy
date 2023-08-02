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

* RuntimeException의 상속 ArgumentException을 직접 구현 
```
public class ArguementException extends RuntimeException {
    public ArguementException(String messsage) {
        super(messsage);
    }
}
```
