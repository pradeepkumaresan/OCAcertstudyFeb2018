package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TryDates {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);
//    today = today.plusDays(2); // assignment of new object to existing variable
    // or at least to *some* is critical
    System.out.println(today.plusDays(2));
    System.out.println(today);

    DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM/d/YYYY HH");
    String asText = format.format(today);
    System.out.println(asText);

  }
}
