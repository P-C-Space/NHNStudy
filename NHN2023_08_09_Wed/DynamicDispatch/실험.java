package NHN2023_08_09_Wed.DynamicDispatch;


class 실험 {
  public static void main(String[] args) {
    Top leftTop = new Left();
    Top rightTop = new Right();
    Top leftD = new Left();
    leftTop.accept( new 걸어() );
    rightTop.accept( new  뛰어() );
    leftD.accept(new 가면서덤블링() );
  }
}
