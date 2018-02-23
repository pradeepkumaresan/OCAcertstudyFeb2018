package selections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selection {
  public static List<String> findShortStrings(List<String> ls, int threshold) {
    List<String> out = new ArrayList<>();
    for (String s : ls) {
      if (s.length() > threshold) {
        out.add(s);
      }
    }
    return out;
  }

  public static List<String> findLowerCaseStartingStrings(List<String> ls) {
    List<String> out = new ArrayList<>();
    for (String s : ls) {
      if (Character.isLowerCase(s.charAt(0))) {
        out.add(s);
      }
    }
    return out;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila", "Bert", "van der Valk");
    System.out.println("All: " + ls);
    System.out.println("Long: " + findShortStrings(ls, 4));
    System.out.println("lower: " + findLowerCaseStartingStrings(ls));
  }
}
