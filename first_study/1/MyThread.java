
class MyThread {
  public static void main(String args[])
  {
    // Thread a = new Thread("MyFirstThread") {
    //   @Override
    //   public void run() {
    //     System.out.println("in sub thread a: "+getName());
    //   }
    // };
    // Thread b = new Thread(() -> {
    //   System.out.println("in sub thread b");
    // });
    // System.out.printf("a.isAlive() : %s\n", a.isAlive());
    // a.start();
    // System.out.printf("a.isAlive() : %s\n", a.isAlive());
    // b.start();
    // try {
    //   Thread.sleep(1000);
    // } catch(Exception e) {
    //   System.out.println(e);
    // }
    // System.out.println(MyThread.class);

    Dummy i = new Dummy();
    Thread a = new Thread() {
      @Override
      public void run() {
        try {
          synchronized (i) {
            // i.wait();
            i.number += 100;
          }
          // i.notify();
          Thread.sleep(1);
        } catch(Exception e) {
          e.printStackTrace();
          System.exit(0);
        }
      }
    };
    Thread b = new Thread() {
      @Override
      public void run() {
        try {
          synchronized (i) {
            // i.wait();
            i.number -= 100;
          }
          // i.notify();
          Thread.sleep(1);
        } catch(Exception e) {
          e.printStackTrace();
          System.exit(0);
        }
      }
    };
    a.start();
    b.start();
    // try {
    //   a.join();
    //   b.join();
    // } catch(Exception e) {
    //   System.err.println(e);
    // }
    i.showNumer();
  }
}

class Dummy {
  int number = 0;
  boolean using = false;
  void showNumer() {
    System.out.printf("number: %d\n", number);
  }
}
