import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

class IO {
  public static void main(String args[]) {
    // File f1 = new File("./", "Class1.java");
    // System.out.println(f1.getPath());
    // // System.out.println(f1.getCanonicalPath()); // why IOException?
    // System.out.println(f1.getAbsolutePath());
    // System.out.println(f1.lastModified());
    // System.out.println((new Date(f1.lastModified())).toString());
    // System.out.println(f1.isDirectory());
    // System.out.println(f1.mkdirs());
    // System.out.println(f1.mkdir());
    // File f2 = new File("./sample");
    // System.out.println("f2");
    // System.out.println(f2.isDirectory());
    // System.out.println(f2.isFile());
    // f2.mkdirs();
    // System.out.println(f2.isDirectory());
    // System.out.println(f2.isFile());
    // String[] a = f2.list();
    // for(String s : a ) {
    //   System.out.println(s);
    // }
    Dummy test = new Dummy();
    // test.test1();
    System.out.printf("my num: %e\n", 1.2);
    System.out.printf("%tp\n", new Date());
    System.out.printf("%(d\n", -1);
    System.out.printf("%020.5f xxx\n", 12345678.123456);
  }
}

class Dummy {
  void test1() {
    try {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      String s;
    for (s = r.readLine();!s.equals("q"); s = r.readLine()) {
        System.out.println("given: "+s);
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
