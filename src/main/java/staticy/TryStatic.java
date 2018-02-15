package staticy;

class X {
  static int MAX_VAL = 100; // ONLY ONE!!!
  int value = 99; // One per instance
  public void setVal(int x) {
    if (x <= MAX_VAL) value = x;
  }
}

public class TryStatic {
  public static void main(String[] args) {
    X a = new X();
    X b = new X();
    a.setVal(120);
    System.out.println("a.MAX_VAL is " + a.MAX_VAL);
    System.out.print(a.value + ", ");
//    b.MAX_VAL = 150;
    X.MAX_VAL = 150;
    System.out.println("a.MAX_VAL is " + a.MAX_VAL);
    a.setVal(140);
    System.out.println(a.value);
    /*
    What is the result?
    A) 99, 99
    B) 120, 140
    C) 99, 140
    D) Compilation failure
    E) Exception at runtime
     */
  }
}
