import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AverageTest {

  final static double DELTA = 0.000000001;

  @Test
  public void testAverage1() {
    final List<Double> temps = Arrays.asList(3.4);
    final TempStats actual = Average.calculateStats(temps);
    assertEquals(3.4, actual.average, DELTA);
    assertEquals(0, actual.countAboveAverage);
  }

  @Test
  public void testAverage2() {
    final List<Double> temps = Arrays.asList(3.4, 3.6);
    final TempStats actual = Average.calculateStats(temps);
    assertEquals(3.5, actual.average, DELTA);
    assertEquals(1, actual.countAboveAverage);
  }

}