// Reads temperatures from the user, computes average and # days above average.

import java.util.List;

public class Average {

  public static double average(final List<Double> temps) {
    double sum = 0;
    for (final double current: temps) {    // read/store each day's temperature
      sum += current;
    }
    return sum / temps.size();
  }

  public static int daysAbove(final List<Double> temps, final double value) {
    int count = 0;                      // see if each day is above average
    for (final double current: temps) {
      if (current > value) {
        count++;
      }
    }
    return count;
  }
}
