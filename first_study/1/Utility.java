import java.util.*;

class Utility {
  public static void main(String args[]) {
    // // random
    // Random r = new Random();
    // System.out.println(r.nextInt());
    // System.out.println(new Date());
    //
    // // Data, Calendar
    // Date today = new Date();
    // Date yesterday = new Date(today.getYear(), today.getMonth(), today.getDay()-100);
    // System.out.println(today.compareTo(yesterday));

    // Vector, ArrayList
    // Vector<Integer> array = new Vector<Integer>();
    // for (int i = 0; i < 100 ; i++) {
    //   array.add(Integer.valueOf(i));
    // }
    // System.out.println("array.size: "+array.size());
    // System.out.println("array.capacity: "+array.capacity());
    // array.setSize(1000);
    // System.out.println("array.size: "+array.size());
    // System.out.println("array.capacity: "+array.capacity());
    // System.out.println("array.elementAt(array.size()): "+array.elementAt(array.size()-1));
    // array.trimToSize();
    // System.out.println("array.size: "+array.size());
    // System.out.println("array.capacity: "+array.capacity());
    // System.out.println("array.elementAt(array.size()): "+array.elementAt(array.size()-1));
    // for (int i = 0; array.elementAt(i) != null; i++) {
    // // for (int i = 0; i<array.size(); i++) {
    //   System.out.println("array["+i+"]: "+array.elementAt(i));
    // }


    // ArrayList<Integer> array = new ArrayList<Integer>();
    // for (int i = 0; i < 100 ; i++) {
    //   array.add(Integer.valueOf(i));
    // }
    // System.out.println("array.size: "+array.size());
    // System.out.println("array.size: "+array.size());
    // // for (int i = 0; i < array.size(); i++) {
    // //   System.out.println("array["+i+"]: "+array.get(i));
    // // }
    // for (Integer i : array ) {
    //   System.out.println(i);
    // }
    // // test(1, 1.0);
    // // test("string", 2);

    // Hashtable
    Hashtable<String, Integer> h = new Hashtable<String, Integer>();
    h.put("1", 1);
    h.put("2", 2);
    h.put("3", 3);
    System.out.println(h);
    System.out.println(h.remove("3"));
    System.out.println(h.contains("2"));
  }
  public static <T extends Object, S extends Object> void test(T v, S s) {
    System.out.println(v instanceof Integer);
    System.out.println(s instanceof Integer);
  }
}
