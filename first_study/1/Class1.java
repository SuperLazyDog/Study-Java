class Class1 {
  public static void main(String args[]) {
    System.out.println("hello");
    // Sample sample = new Sample(5, 4 ,3);
    // sample.inspect();
    // Dummy1 a, b;
    // a = new Dummy1();
    // b = new Dummy1();
    // System.out.println(a == b);
    // System.out.println(a.equals(b));
    // System.out.println(b.equals(a));
    //
    // System.out.println(a.getClass().getSuperclass());
    // System.out.println((new Integer(1)).getClass().getSuperclass());
    // Class t = Class.forName("Class1");
    IntfA a = new ABC();
    a.sayHello();
    System.out.println(a.SAMPLE);
    System.out.println(a.sample);

    ABC b = new ABC();
    b.sayHello();
    System.out.println(b.SAMPLE);
    System.out.println(b.sample);
    System.out.println(ABC.sample);

  }
}

class Sample {
  int a = 1, b = 2, c = 3;

  Sample(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  void inspect() {
    hello();
    System.out.println("a:"+a+", b:"+b+", c:"+c);
  }

  void hello() {
    System.out.println("hello in Sample");
    // System.out.println(this.getClass());
  }
}
abstract class Dummy {
  abstract int test();
}

class Dummy1 extends Dummy {
  int test() {
    return 100;
  }
}


interface IntfA {
  String SAMPLE = "SAMPLE INTERFACE";
  public String sample = "sample interface";
  void sayHello();
}

class ABC implements IntfA {
  public void sayHello() {
    System.out.println("hello from interface IntfA");
  }
}
