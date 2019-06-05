class StaticTest {
  int i = 10;
  static int j = 100;
  public static void main(String[] args)
  {
    StaticTest t1 = new StaticTest();
    StaticTest t2 = new StaticTest();
    t1.i = 100;
    t1.j = 300;
    System.out.println(t1.i+"   "+t1.j);
  }
}
