package NNH2023_08_08_Tue.animals2;

public class Main {
    public static void main(String[] args) {
        System.out.println("날기 가능?");
        Typing.canfly(new 박쥐());
        Typing.canfly(new 펭귄());
        Typing.canfly(new 참새());

        System.out.println("그럼 수영 가능?");
        Typing.canswim(new 박쥐());
        Typing.canswim(new 펭귄());
        Typing.canswim(new 참새());
    }
}
