package NHN2023_08_09_Wed.DynamicDispatch;

public class 가면서덤블링 implements Visitor {

    @Override
    public void visit(Left left) {
        System.out.println("왼쪽으로 덤블링");
    }
    @Override
    public void visit(Right right) {
        System.out.println("오른쪽으로 덤블링");
    }
    
}
