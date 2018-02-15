package isarelationship;
class Base2 {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
  // This is overRIDE (replacement method, must satisfy Liskov Substitution
  /*private*/ void doBaseStuff() {
    System.out.println("do other BaseStuff");
  }

  // method is "OVERLOAD" -- a whole new method
  private void doBaseStuff(int x) {
    System.out.println("doSubStuff");
  }
}

 public class IsAEx1 {
   public static void main(String[] args) {
    /* In the Base2 and Sub2 classes, which are true in isolation?
    A) doBaseStuff in Base2 can be marked public without causing errors
    B) doBaseStuff in Base2 can be marked private without causing errors
    C) doBaseStuff in Sub2 can be marked public without causing errors
    D) doBaseStuff in Sub2 can be marked protected without causing errors
    E) doBaseStuff in Sub2 can be marked private without causing errors
     */
   }
}
