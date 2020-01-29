// Reads temperatures from the user, computes average and # days above average.

import java.util.List;

public class Average {

  public static TempStats calculateStats(final List<Double> temps) {
    double sum = 0;
    for (final double current: temps) {    // read/store each day's temperature
      sum += current;
    }
    final double average = sum / temps.size();

    int count = 0;                      // see if each day is above average
    for (final double current: temps) {
      if (current > average) {
        count++;
      }
    }

    return new TempStats(average, count);
  }
}
