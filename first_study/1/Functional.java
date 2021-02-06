import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Functional {

  public static void main(String args[]) {
    List<String> list = new ArrayList(100);
    for (int i = 0; i < 100 ; i++) {
      list.add(String.valueOf(i));
    }
    // for-each
    // for (String s : list) {
    //   System.out.printf("%s%n", s);
    // }

    // 原始方法
    class PrintDate implements Consumer<Object> {
      private int i = 0;
      @Override
      public void accept(Object t) {
          System.out.printf("printData[%02d]: %s\n", i++, t);
      }
    }
    list.forEach(new PrintDate());

    // 原始方法之匿名函数
    list.forEach(new Consumer<Object>() {
      private int i = 0;
      @Override
      public void accept(Object s) {
        System.out.printf("%d: %s\n", i++, s);
      }
    });
    // lambda
    list.forEach((str) -> { System.out.printf("num: %s\n", str); });

    // A.FunctionalInterface r = new A.FunctionalInterface() {
    //   @Override
    //   public void run() {
    //     System.out.println("in runnable");
    //   }
    // };
    // // r = () -> {
    // //   System.out.printf("in lambda runnable\n");
    // // };
    // r.run();

  }
}

class A {
  public interface FunctionalInterface {
    // public abstract void run();
    default void run() {
      System.out.println("default method");
    }
  }
  public static interface FunctionalInterfaceS {
    public abstract void run();
  }
}
