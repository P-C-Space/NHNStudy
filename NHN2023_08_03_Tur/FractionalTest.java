package NHN2023_08_03_Tur;

public class FractionalTest {
    private FractionalTest() {}


    public static int[] fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is to big");
        }
        int[] rep = new int[] {numerator, denominator};
        normalize(rep);
        // classInvariant(rep);
        return rep;
    }

    public static int numerator(int[] r) {
        // normalize(r);
        return r[0];
    }

    public static int denominator(int[] r) {
        // normalize(r);
        return r[1];
    }

    private static void normalize(int[] r) {
        int gcd = Mathx.GCD(r[0], r[1]);
        r[0] /= gcd;
        r[1] /= gcd;
    }

    public static int[] add(int[] arr1, int[] arr2) {
        int x = numerator(arr1) * denominator(arr2) + denominator(arr1) * numerator(arr2);
        int y = denominator(arr1) * denominator(arr2);
        return fractional(x, y);
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        return (denominator(arr2) * numerator(arr1) == (numerator(arr2) * denominator(arr1)));
    }

    private static String toString(int[] arr) {

        return numerator(arr) + "/" + denominator(arr);
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

        int[] x = fractional(2, 4);
        int[] y = fractional(1, 2);
        int[] w = fractional(4, 8);
        int[] z = fractional(5, 10);

        System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        // 주소값 저장 다르다.
        System.out.println(add(x, y) == add(z, w));

        int[][] rs = {x, y, w, z};
        for (int[] r : rs) {
            System.out.println(toString(r));
        }
        System.out.println(isEqual(x, y));
        System.out.println(isEqual(y, w));
        System.out.println(isEqual(w, z));

    }


}
