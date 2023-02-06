import java.util.Collections;
import java.util.List;

/**
 * Automated unit test suite for the calculcateStats method.
 */
public class AverageTest {

  static final double DELTA = 0.000000001;

  public void testAverage0() {
    final var temps = Collections.<Double>emptyList();
    final var actual = Average.calculateStats(temps);
    assert actual == null;
  }

  private void testAverage(
    final List<Double> temps, 
    final double expectedAverage, 
    final int expectedCountAboveAverage
  ) {
    final var actual = Average.calculateStats(temps);
    assert Math.abs(expectedAverage - actual.average) <= DELTA;
    assert expectedCountAboveAverage == actual.countAboveAverage;
  }

  public void testAverage1() {
    testAverage(List.of(3.4), 3.4, 0);
  }

  public void testAverage2() {
    testAverage(List.of(3.4, 3.6), 3.5, 1);
  }
}
