package equality;

public class MoreTests {
  public static void main(String[] args) {
    String s = new String("Hello");
    StringBuilder sb = new StringBuilder(s);

    System.out.println("s is " + s);
    System.out.println("sb is " + sb);

    System.out.println("s.equals(sb) " + s.equals(sb));
    System.out.println("s.equals(sb.toString()) " + s.equals(sb.toString()));
    /*
    A) true
    B) false
    C) Runtime problem?
     */
  }
}
