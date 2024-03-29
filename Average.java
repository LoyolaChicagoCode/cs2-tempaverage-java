import java.util.List;

public class Average {

  /**
   * Computes average and # days above average in the given list.
   */
  public static TempStats calculateStats(final List<Double> temps) {

    if (temps.isEmpty()) {
      return null;
    }

    var sum = 0d;
    for (final var current : temps) { // read/store each day's temperature
      sum += current;
    }
    final var average = sum / temps.size();

    var count = 0; // see if each day is above average
    for (final var current : temps) {
      if (current > average) {
        count++;
      }
    }

    return new TempStats(average, count);
  }
}
