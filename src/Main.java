// Reads temperatures from the user, computes average and # days above average.
import java.util.*;

public class Main {

  final static int DAYS = 7;

  public static void main(final String[] args) {

    int days = DAYS;

    if (args.length == 1) {
      try {
        days = Integer.parseInt(args[0]);
      } catch (final NumberFormatException ex) {
        System.err.println("argument should be a nonnegative integer");
        System.exit(4);
      }
    }
    if (days < 0) {
      System.err.println("argument should be a nonnegative integer");
      System.exit(2);
    }

    // read data
    final Scanner console = new Scanner(System.in);
    final double[] temps = new double[days];        // array to store days' temperatures
    System.out.println("days = " + days);
    for (int i = 0; i < days; i++) {    // read/store each day's temperature
      temps[i] = console.nextDouble();
      System.out.println("temp[" + i + "] = " + temps[i]);
    }

    // report results
    final double average = Average.average(temps);
    System.out.printf("Average temp = %.1f\n", average);
    System.out.println(Average.daysAbove(temps, average) + " days above average");
  }
}