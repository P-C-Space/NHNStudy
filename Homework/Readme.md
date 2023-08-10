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