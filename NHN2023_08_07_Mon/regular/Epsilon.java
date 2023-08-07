package NHN2023_08_07_Mon.regular;

public final class Epsilon implements Expression{
    public static Epsilon instance = new Epsilon();

    private Epsilon(){}

    @Override
    public String toString(){
        return "\u03b5";
    }

    // public static Epsilon getInstance(){
    //     if(instance == null){
    //         instance = new Epsilon();
    //     }

    //     return instance;
    // }
}
