package constructructors;

public class X {
  private int something = 100;
  private int theValue;

  @Override
  public String toString() {
    return "X{" + "theValue=" + theValue + '}';
  }

  public void X() {
    System.out.println("in method with stupid, dangerous, name!!!");
  }

  public X() {
//    System.out.println("Hello");
    this(40); // call into (but don't create new object) the other matching constructor
//    this(something); // call to this(xxx) or super(xxx) must be "first" and no instance behavior
    // is allowed in computing the argument list either!!!
    //    this = new X(40); // NOPE, creates entirely new object
//    theValue = 40;
    System.out.println("in non-default constructor with zero arg");
  }

  public X(int x) {
    // compiler inserts super() when neither this(...) nor super(...) is coded.
    if (x < 50 || x > 100) throw new IllegalArgumentException("Bad value for x " + x);
    theValue = x;
    System.out.println("in non-default constructor with single int arg");
  }

  public static void main(String[] args) {
    X x = new X(); // must have a constructor that takes no arguments (and is accessible)
//    X x = new X(101);
    System.out.println("got x: " + x);
    x.X();
  }
}
