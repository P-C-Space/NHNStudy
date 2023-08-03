package NHN2023_08_03_Tur;


public class Mathx {
    public static int sum(int n) { // Overloading
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    public static int[] addF(int[] numbers) {
        int[] result = new int[2];
        result[0] = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        result[1] = numbers[1] * numbers[3];
        return result;
    }

}
