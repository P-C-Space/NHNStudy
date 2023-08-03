package NHN2023_08_03_Tur;

public class RangeTest {

    public static void classInvariant() {
        int lower = -2;
        int upper = -6;
        Range range = null;
        try{
            // 조건을 충족하지 않는 존재는 만들지조차 않아야 함
            // => try안에 생성
            range = new Range(lower, upper);  // 인자는 두개뿐, 음수일 때 도 허용
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            // System.out.format("Range: lower %d가 upper %d보다 큽니다.%n", 
            // lower, upper);
        }
    }

    public static void lowerBound(){
        assert true;
    }

    public static void upperBound(){
        assert true;
    }
}
