import java.util.Collections;
import java.util.List;

public class AverageTest {

  static final double DELTA = 0.000000001;

  static void assertEquals(final int expected, final int actual) {
    assert expected == actual;
  }
  
  static void assertEquals(final double expected, final double actual) {
    assert Math.abs(expected - actual) <= DELTA;
  }
  
  public void testAverage0() {
    final var temps = Collections.<Double>emptyList();
    final var actual = Average.calculateStats(temps);
    assertEquals(null, actual);
  }

  private void testAverage(
    final List<Double> temps, 
    final double expectedAverage, 
    final int expectedCountAboveAverage
  ) {
    final var actual = Average.calculateStats(temps);
    assertEquals(expectedAverage, actual.average, DELTA);
    assertEquals(expectedCountAboveAverage, actual.countAboveAverage);
  }

  public void testAverage1() {
    testAverage(List.of(3.4), 3.4, 0);
  }

  public void testAverage2() {
    testAverage(List.of(3.4, 3.6), 3.5, 1);
  }
}
