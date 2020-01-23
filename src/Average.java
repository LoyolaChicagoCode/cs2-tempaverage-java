// Reads temperatures from the user, computes average and # days above average.

public class Average {

  public static double average(final double[] temps) {
    double sum = 0;
    for (int i = 0; i < temps.length; i++) {    // read/store each day's temperature
      sum += temps[i];
    }
    return sum / temps.length;
  }

  public static int daysAbove(final double[] temps, final double value) {
    int count = 0;                      // see if each day is above average
    for (int i = 0; i < temps.length; i++) {
      if (temps[i] > value) {
        count++;
      }
    }
    return count;
  }
}