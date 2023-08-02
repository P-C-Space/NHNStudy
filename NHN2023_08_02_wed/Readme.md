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

#### 
* main -> os가 호출
