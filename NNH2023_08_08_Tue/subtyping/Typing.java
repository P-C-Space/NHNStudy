package NNH2023_08_08_Tue.subtyping;

abstract class 동물 {

    public final String type() {
        return this.getClass().getSimpleName();
    }

    // public void 날수있니() {
    //     System.out.println(this.type() + " 날 수 있다");
    // }

    // abstract void 헤엄좀치냐();
}


class 새 extends 동물 {

}

interface 날기여부{
    public void 날수있니();
}

class 포유류 extends 동물{
    
}

class 박쥐 extends 포유류 {

}


class 참새 extends 새 implements 날기여부{

    @Override
    public void 날수있니() {
        System.out.println(type() + ": 어떻게 날아줘? 말해봐");
    }

}


class 펭귄 extends 새 implements 날기여부{

    @Override
    public void 날수있니() {
        System.out.println(type() + ": 뭘 날아 스키가 더재밌음");
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


    public static void main(String[] args) {
        동물[] 동물들 = {new 박쥐(), new 참새(), new 펭귄()};

        for (동물 한마리 : 동물들) {
            한마리.날수있니();
        }

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
