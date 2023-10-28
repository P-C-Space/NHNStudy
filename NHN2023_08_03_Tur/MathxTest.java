package NHN2023_08_03_Tur;

public class MathxTest {
    public static void main(String[] args) {
        MathxTest.testRange();

        System.out.println(Mathx.sum(new Range(10)));
        System.out.println(Mathx.sum(new Range(0,10)));
        System.out.println(Mathx.sum(new Range(5,10)));
    }

    private static void testRange(){
        RangeTest.classInvariant();
    }


}
