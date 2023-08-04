package NHN2023_08_04Fri;

public class FractionalTest {
    private FractionalTest() {}



    public static void main(String[] args) {
        Fractional[] rs = {new Fractional(4, 8), 
            new Fractional(2, 4), 
            new Fractional(2, 3),
            new Fractional(1, 2),
        };

        for (Fractional r : rs) {
            System.out.println(r);
        }   


    }


}
