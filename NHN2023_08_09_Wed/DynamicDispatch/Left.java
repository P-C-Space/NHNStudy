package NHN2023_08_09_Wed.DynamicDispatch;

public class Left implements Top{

    @Override
    public void accept(Visitor v) {
        v.visit(this);
   }

}
