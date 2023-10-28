package NNH2023_08_08_Tue.animals2;

public class Typing {
    public static void canfly(Animals x){
        System.out.println(x.type() + (x.canfly() ? "는(은) 날 수 있어." : "는(은) 못 날아."));
    }

    public static void canswim(Animals x){
        System.out.println(x.type() +  (x.canswim() ? "는(은) 수영 가능." : "는(은) 수영 못해."));
    }
}
