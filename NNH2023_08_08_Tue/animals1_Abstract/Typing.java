package NNH2023_08_08_Tue.animals1_Abstract;

public class Typing {
    public static void canfly(Animals x){
        System.out.println(x.type() + (x.canfly() ? "는(은) 날 수 있어." : "는(은) 못 날아."));
    }
}
