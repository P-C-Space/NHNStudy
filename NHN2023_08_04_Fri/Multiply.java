package NHN2023_08_04_Fri;

public final class Multiply <T extends Number> implements BinaryOperation<T>{

    @Override
    public T apply(T x, T y) {
        return x * y;
    }
    
}
