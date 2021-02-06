class Error {
  public static void main(String args[]) {
    try {
      Dummy a = new Dummy();
      a.a();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("over");
    }
    assert 1 < 0:"UUID";
  }
}

class Dummy {
  void a() {
    b();
  }

  void b() {
    c();
  }

  void c() {
    d();
  }

  void d() {
    int a = 1/0;
  }
}
