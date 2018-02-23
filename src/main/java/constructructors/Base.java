package constructructors;

class Base {
//  {
//    System.out.println("first instance init xInBase is " + xInBase);
//  }
  int xInBase = 99;
  {
    System.out.println("second instance init xInBase is " + xInBase);
  }
  public Base(int x) {
    // goes to Object!!!
    // On return, runs through instance initilizations (e.g. xInBase = 99)
    System.out.println("value of xInBase is " + xInBase);
    System.out.println("value of y is " + y);
  }
  int y;
  {
    System.out.println(y);
    y = 1234;
  }

}

/*
A) subclass message first then parent
B) parent first, then sub
 */
class Sub extends Base {
  Sub(int x) {
    // parent constructor WITH ZERO ARGS is default!!!
    // if our code (in constructor) does not refer to *any* call to super(...)
    // then the compiler inserts super() <-- i.e. the same as the default
    super(x);
    System.out.println("In subclass constructor");
  }
}

class TestIt {
  public static void main(String[] args) {
    new Sub(99);
  }
}