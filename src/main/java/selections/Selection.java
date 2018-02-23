package selections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//interface StringTester {
//  boolean test(String s);
//}
//
//class LongStringTester implements StringTester {
//  public boolean test(String s) {
//    return s.length() > 4;
//  }
//}
//
//class LowerStartStringTester implements StringTester {
//  public boolean test(String s) {
//    return Character.isLowerCase(s.charAt(0));
//  }
//}

// Replaced by LIBRARY/API interface called java.util.function.Predicate
//interface StringTester {
//  boolean test(String s);
//}

class LongStringTester implements Predicate<String> {
  public boolean test(String s) {
    return s.length() > 4;
  }
}

class LowerStartStringTester implements Predicate<String> {
  public boolean test(String s) {
    return Character.isLowerCase(s.charAt(0));
  }
}

public class Selection {
  public static List<String> findStringsWithATest(List<String> ls, Predicate<String> theTest) {
    List<String> out = new ArrayList<>();
    for (String s : ls) {
      if (theTest.test(s)) {
        out.add(s);
      }
    }
    return out;
  }

//  public static List<String> findLowerCaseStartingStrings(List<String> ls) {
//    List<String> out = new ArrayList<>();
//    for (String s : ls) {
//      if (Character.isLowerCase(s.charAt(0))) {
//        out.add(s);
//      }
//    }
//    return out;
//  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila", "Bert", "van der Valk");
    System.out.println("All: " + ls);
//    System.out.println("Long: " + findShortStrings(ls, 4));
//    System.out.println("lower: " + findLowerCaseStartingStrings(ls));
//    System.out.println("Long: " + findStringsWithATest(ls, new LongStringTester()));
//    System.out.println("Lower: " + findStringsWithATest(ls, new LowerStartStringTester()));
    System.out.println("Long: " + findStringsWithATest(ls, (s) -> s.length() > 4));
    System.out.println("Lower: " + findStringsWithATest(ls, (s) -> Character.isLowerCase(s.charAt(0))));
  }
}
