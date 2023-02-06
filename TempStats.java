/**
 * Represents a temperature average and the number of days above 
 * that average as a single object.
 */
public class TempStats {

  public TempStats(final double average, final int countAboveAverage) {
    this.average = average;
    this.countAboveAverage = countAboveAverage;
  }

  public final double average;

  public final int countAboveAverage;
}
