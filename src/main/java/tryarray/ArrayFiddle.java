package tryarray;

public class ArrayFiddle {
  public static void main(String[] args) {
    final int[] ia = {1,2,3,4,5};
    System.out.println("size of ia is " + ia.length);
//    ia[5] = 6;
    ia[0] = 99;
    int [] ib = new int[10];
    System.arraycopy(ia, 0, ib, 0, ia.length);
//    ia = ib;
//    ia[5] = 6;
    System.out.println("size of ia is " + ia.length);
    for (int i : ia) {
      System.out.println(i);
    }
  }
}
