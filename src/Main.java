// Reads temperatures from the user, computes average and # days above average.
import java.util.*;

public class Main {

  public static void main(final String[] args) {

    // read data
    final Scanner console = new Scanner(System.in);
    final List<Double> temps = new ArrayList<>(); // list to store days' temperatures
    while (console.hasNextDouble()) {    // read/store each day's temperature
      final double value = console.nextDouble();
      temps.add(value);
      final int pos = temps.size() - 1;
      System.out.println("temp[" + pos + "] = " + value);
    }

    // calculate results
    final TempStats result = Average.calculateStats(temps);

    // report results
    System.out.printf("Average temp = %.1f\n", result.average);
    System.out.println(result.countAboveAverage + " days above average");
  }
}