package NHN2023_08_09_Wed;

abstract class 동물{

}

abstract class 교통수단{

}

abstract class 새 extends 동물{

}

class 참새 extends 새 implements Flyable{

    @Override
    public boolean 날수있니() {
        return true;
    }

}

class 비행기 extends 교통수단 implements Flyable{

    @Override
    public boolean 날수있니() {
        return true;
    }

}

interface Flyable{
    boolean 날수있니();
}

public class TypingRemind {
    public static void main(String[] args) {
        
    }
}
