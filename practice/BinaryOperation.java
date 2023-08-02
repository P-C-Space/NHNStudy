package practice;

public interface BinaryOperation {
    // 여러개 사용시 dart의 required 역할처럼 다른 함수에서도 
    // 필수적으로 요구하게됨
    // 즉 이 BinaryOperation의 상속을 받는다면 모두 사용해야하기
    // 때문에 공통적인 요소가 아니면 사용하지 않는 것을 권장
    public double apply(double x,double y);
    // public int apply(int x, int y);
}
