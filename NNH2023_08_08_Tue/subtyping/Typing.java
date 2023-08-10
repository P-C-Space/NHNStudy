package NNH2023_08_08_Tue.subtyping;

// Legacy code
abstract class 동물 {
    private boolean flyable;

    protected 동물(boolean flyable){
        this.flyable = flyable;
    }

    public String type() {
        return Typing.type(this);
    }
    // public void 날수있니() {
    // System.out.println(this.type() + " 날 수 있다");
    // }

    // abstract void 헤엄좀치냐();
    public boolean 날수있니() {
        return flyable;
    }
}
interface Flyable {

}

interface Swimable{

}

final class 비행기 implements Flyable{

}

final class 헤엄치고날으는펭귄 extends 펭귄 implements Swimable{

}

final class FlyableBat extends 박쥐 implements Flyable {

}


abstract class 새 extends 동물 {
    public 새(boolean flyable) {
        super(flyable);
    }
}



// interface 날기여부 {
// public void 날수있니();
// }


class 박쥐 extends 동물 {

    박쥐(){
        super(true);
    }

}


final class 참새 extends 새 {

    public 참새() {
        super(true);
    }

}


class 펭귄 extends 새 {
    펭귄(){
        super(false);
    }

}


public class Typing {
    // public static void 날수있니(동물 x) {
    // dispatch on types
    // RTTI (RunTime Type Identification)
    // if (x instanceof 박쥐) {
    // System.out.println("박쥐 날 수 있다");
    // } else if (x instanceof 참새) {
    // System.out.println("참새 날 수 있다");
    // } else if (x instanceof 펭귄) {
    // System.out.println("펭귄 날 수 있다");
    // } else {
    // throw new RuntimeException("no such type");
    // }

    // }
    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }

    public static void 날수있니(동물 x) {
        System.out.println(x.type() + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 못날아."));
    }

    public static void 날수있니(Flyable thing) {
        System.out.println(Typing.type(thing) + "는(은) 날 수 있어.");
    }

    public static void main(String[] args) {
        // Flyable[] 날것들 = {new 박쥐(), new 참새(), new 펭귄(), new 비행기()};
        Flyable[] 날것들 = {new FlyableBat(), new 비행기()};
        for (Flyable 날것 : 날것들) {
            // 한마리.날수있니();
            Typing.날수있니(날것);
        }

        Swimable sa = new 헤엄치고날으는펭귄();
        // 박쥐 a = new 박쥐();
        // 참새 b = new 참새();
        // 펭귄 c = new 펭귄();


        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // Typing.날수있니(a);
        // Typing.날수있니(b);
        // Typing.날수있니(c);


    }

}
