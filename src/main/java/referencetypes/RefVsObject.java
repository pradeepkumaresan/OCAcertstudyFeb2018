package referencetypes;

class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

final class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

//class FunkySub extends Sub implements Runnable {
//
//  @Override
//  public void run() {
//    System.out.println("I'm in run()");
//  }
//}

public class RefVsObject {
  public static void main(String[] args) {
    Base b = new Sub();
//    b.doBaseStuff();
    ((Sub) b).doOtherStuff();

    /*
    What is the result?
    A) doSubStuff
    B) doOtherStuff
    C) doBaseStuff
    D) Exception at runtime
    E) Compilation failure
     */

    ((Runnable) b).run();

    Sub s2 = new Sub();
//    ((Runnable)s2).run();
    /*
    final class Sub...
    A) invokes run
    B) runtime exception
    C) Compiler error

     */

//    Sub s1 = new FunkySub();
//    ((Runnable) s1).run();
/*
  A) invokes run()
  B) Doesn't compile
  C) Doesn't Execute
  D)/E) ???
 */
//    Runnable r = new Sub();
//    Sub s = new Sub();
//    Runnable r = (Runnable)s;
  }

}
