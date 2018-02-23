package equality;

public class Tests {
  public static void main(String[] args) {
    String s = new String("Hello");
    String t = new String("Hello");

//    String s = "Hello";
//    String t = "Hello";

    System.out.println("s == t is: " + (s == t));
    System.out.println("s.equals(t) is: " + s.equals(t));

    System.out.println("s is " + s);
//    String u = s.concat(" world");
    s = s.concat(" world");

    // how many objects are eligible for GC
    /*
    A) 0
    B) 1
    C) 2
    D) other...
     */
    System.out.println("s is " + s);
//    System.out.println("u is " + u);


  }
}
