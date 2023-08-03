package NHN2023_08_03_Tur;

public class FractionalTest {
    private FractionalTest() {}


    public static int[] fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is to big");
        }
        return new int[] {numerator, denominator};
    }

    public static int numerator(int[] r) {
        return r[0];
    }

    public static int denominator(int[] r) {
        return r[1];
    }

    public static int[] add(int[] arr1, int[] arr2) {
        int[] result = new int[2];
        result[0] = numerator(arr1) * denominator(arr2) + denominator(arr1) * numerator(arr2);
        result[1] = denominator(arr1) * denominator(arr2);
        int gcd = Mathx.GCD(result[0], result[1]);

        result[0] /= gcd;
        result[1] /= gcd;

        return result;
    }

    public static void main(String[] args) {// throws IOException {

        // 유리수의 덧셈
        // 유리수 수 네개
        // 1 / 3 . 1 / 4
        // 새로운 클래스 못 만들어요 ㅠㅠ
        // 네 개의 숫자를 받을 때까지 반복
        // 정수 네개만 들어온다면 통과
        // 에러처리 생략 -> 무조건 네개가 들어온다고 약속
        // main에 전부 생성

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[4];

        int index = 0;
        if (args.length == 0) {
            for (int i = 0; i < 4; i++) {
                numbers[index++] = i + 1;
            }
        } else {
            for (String s : args) {
                numbers[index++] = Integer.parseInt(s);
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }

        int moleculea = (numbers[0] * numbers[3] + numbers[2] * numbers[1]);
        int denominator = (numbers[1] * numbers[3]);
        int gcd = Mathx.GCD(moleculea, denominator);

        System.out.println(moleculea / gcd + "/" + denominator / gcd);

        int[] x = fractional(1, 2);
        int[] y = fractional(2, 4);
        int[] w = fractional(4, 8);
        int[] z = fractional(5, 10);

        System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
    }

    private static String toString(int[] arr) {
        return numerator(arr) + "/" + denominator(arr);
    }
}
