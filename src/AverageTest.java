import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class AverageTest {

  final static double DELTA = 0.000000001;

  @Test
  public void testAverage0() {
    final List<Double> temps = Collections.emptyList();
    final TempStats actual = Average.calculateStats(temps);
    assertEquals(null, actual);
  }

  private void testAverage(final List<Double> temps,
                           final double expectedAverage,
                           final int expectedCountAboveAverage) {
    final TempStats actual = Average.calculateStats(temps);
    assertEquals(expectedAverage, actual.average, DELTA);
    assertEquals(expectedCountAboveAverage, actual.countAboveAverage);
  }

  @Test
  public void testAverage1() {
    testAverage(Arrays.asList(3.4), 3.4, 0);
  }

  @Test
  public void testAverage2() {
    testAverage(Arrays.asList(3.4, 3.6), 3.5, 1);
  }
}