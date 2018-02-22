package methodidentity;

import java.io.IOException;

class Parent {
  int v = 99;

  int doStuff(int x) {
    System.out.println("Parent.doStuff(" + x + ")");
    return x * 2;
  }

  Parent getSelf() {
    return this;
  }

  CharSequence getText() {
    return "Hello";
  }

  long getVal() {
    return 99;
  }

  protected void silentStuff()/* throws IOException */ {
  }

  //  @Override
//  public int equals(Object p) {
//    int rv = 0;
//    if (p.getClass() == this.getClass()) {
//      if (((Parent)p).v == this.v) rv = 1;
//    }
//    return rv;
//  }
//}
  @Override
  public boolean equals(Object p) {
    System.out.println("In my equals");
    if (p.getClass() == this.getClass()) {
      System.out.println("classes same...");
      return ((Parent) p).v == this.v;
    } else return false;
  }
}

class Sub extends Parent {
  int doStuff(int y, int x) {
    System.out.println("Sub.doStuff(" + y + ")");
    return y * 3;
  }

  @Override
  String getText() {
    return "Specific";
  }

  @Override
  Sub getSelf() {
    return this;
  }

  // covariant returns don't work with primitives!
//  @Override
//  int getVal() {
//    return 9;
//  }

//  @Override
// if less accessible, then attempt
// to access via Parent reference would fail at runtime!
  public void silentStuff() {
    if (Math.random() > 0.5) {
      try {
        throw new IOException();
      } catch (Exception e) {
        e.printStackTrace();
      }

    }
  }
/* If I remove throws IOException here..
A) just fine
B) compiler fails
C) possibly fails at runtime?
 */

  // A) make it public?
  // B) make it private?
  // C) throws RuntimeException?
  // D) throws IOException?
  // E) None of the above!
}

public class Overriding {
  public static void main(String[] args) {
    Parent p = new Sub();
//    Parent p = new Parent();
    System.out.println("> " + p.doStuff(3));
    Object p2 = new Parent();
    Object p1 = new Parent();
    System.out.println("p1.equals(p2) ? " + (p1.equals(p2)));

    Parent p3 = p.getSelf();

    p.silentStuff();
  }
}
