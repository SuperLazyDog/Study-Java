// class Example1 {
//   public static void main(String args[]) {
//     System.out.println("This is the output for Example1~~");
//     System.out.println("this is my first number: "+9e2f);
//     int a[] = {1, 2, 3, 4, 5};
//     System.out.println("my array: "+a);
//   }
// }

class Example1 {
  public static void main(String args[]) {
    // int a[];
    // System.out.println("dummy");
    // System.out.println(Math.signum(123445));
    // System.out.println("1,2,3,4,5".split(",").length);
    // System.out.println("1,2,3,4,5".split(",", 2).length);
    // System.out.println(Integer.MAX_VALUE);
    // System.out.println(Math.scalb(1.0, 31));
    // int i = Integer.MAX_VALUE;
    // int count = 0;
    // while (i>1) {
    //   i = i/2;
    //   System.out.println(i);
    //   count++;
    // }
    // System.out.println("count: "+ count);
    // System.out.println(Integer.TYPE);
    // System.out.println(Integer.SIZE);
    // System.out.println("Integer:"+Integer.SIZE);
    // System.out.println("Byte:"+Byte.SIZE);
    // System.out.println("Short:"+Short.SIZE);
    // System.out.println("Long:"+Long.SIZE);
    // System.out.println(Character.TYPE+":"+Character.SIZE);
    // System.out.println((new Integer(Character.MAX_VALUE)).toString());
    // System.out.println((new Integer(Character.MIN_VALUE)).toString());
    // System.out.println(Short.MAX_VALUE);
    // System.out.println(Byte.MAX_VALUE);
    // System.out.println(Byte.MIN_VALUE);
    // long a = 123;
    // System.out.println(Long.toBinaryString(a));
    // StringBuffer s = new StringBuffer("dummy");
    // s.append("just dummy!");
    // System.out.println(System.currentTimeMillis());
    // System.out.println(s);
    // System.out.println(args);
    // System.out.println(args.length);
    // for (int i = 0; i < args.length ; i++) {
    //   System.out.println("args["+i+"]: "+args[i]);
    // }
    int a = 1;
    if (a == 0) {
      System.out.println("a = 0");
    } else if (a ==1) {
      System.out.println("a = 1");
    } else {
      System.out.println("a != 0 && a != 1");
    }

    a = 100<0 ? 0 : 10;
    System.out.println(a);
    System.out.println(128>>2);
    System.out.println(128>>>2);
  }
}
