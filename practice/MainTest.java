package practice; // practice - 변수

public class MainTest { // MainTest 변수

    static String 한글 = "한글";
    static String message = "Hello. World!";

    public static void main(String[] args) {
        final String message = "Hello.World!!";
        System.out.println(message);
            temp();

        System.out.println(한글);
    }

    public static void temp() {
        System.out.println(message);
    }
}
