package NHN2023_08_09_Wed.DynamicDispatch;

interface Visitor {
    default void visit(Top top) {
        throw new NoSuchMethodError();
    }

    void visit(Left left);

    void visit(Right right);

}
