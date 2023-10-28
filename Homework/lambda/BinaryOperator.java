package Homework.lambda;

@FunctionalInterface // 람다식 가능 - 한개의 추상 메소드만 가짐
public interface BinaryOperator{
    double apply(double x,double y);
}
