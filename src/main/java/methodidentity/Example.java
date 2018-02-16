package methodidentity;

//class SubEx extends Example {
//  @Override
//  void doStuff() {
//
//  }
//}

public class Example {

  void doStuff() {
    System.out.println("void dostuff()");
  }

  // Return value CAN BE IGNORED, so, return type IS NOT part of identity
//  int doStuff() {
//    System.out.println("int dostuff()");
//    return 99;
//  }

  void doStuff(int x) {
    System.out.println("x is " + x);
  }

  // TYPE of argument is available, but name is not (for identity resolution)
//  void doStuff(int y) {
//    System.out.println("x is " + y);
//  }

  // real name is (roughly) methodidentity.Example.doStuff(int, float)
  void doStuff(int x, float f) {
    System.out.println("(int, float) x is " + x + " f is " + f);
  }
//   real name is methodidentity.Example.doStuff(int, int)
  void doStuff(int x, int f) {
    System.out.println("(int, int) x is " + x + " f is " + f);
  }
  void doStuff(float x, int f) {
    System.out.println("(float, int) x is " + x + " f is " + f);
  }

  /*
  "name" of a behavior (i.e. method, function, whatever)
  that name should be an accurate and helpful description of what it does
  SO, two differnt ways of making cake, which essentially "MAKE CAKE" should
  have the same "base" name
  ... this allowed in most OO languages, and is called method overloading
  ESSENCE of this is that "identity" includes the argument types and order...
  Cake bakeCake(Flour f, Eggs e, Sugar s) {}
  Cake bakeCake(PacketMix m) {}
   */
  public static void main(String[] args) {
    Example ex = new Example();

//    int x = ex.doStuff();
    ex.doStuff();
    ex.doStuff(99);

    ex.doStuff(99, 99.9F);
    ex.doStuff(99, 99); // can promote int to float automatically
  }
}
