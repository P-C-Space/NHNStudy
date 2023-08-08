package NHN2023_08_04_Fri;

public class Test {
    public static void main(String[] args) {
        String s = new String("");
        Object o = s;
        System.out.println(s == o);
        String s2 = (String)o;
        System.out.println(s2 == o);

        int x = 4;
        Integer y = new Integer(x);
        System.out.println(x == y);
    }
}
