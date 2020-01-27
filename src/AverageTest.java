import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AverageTest {

  final static double DELTA = 0.000001;

  @Test
  public void testAverage1() {
    final List<Double> temps = Arrays.asList(3.4);
    final double actual = Average.average(temps);
    assertEquals(3.4, actual, DELTA);
  }

  @Test
  public void testAverage2() {
    final List<Double> temps = Arrays.asList(3.4, 3.6);
    final double actual = Average.average(temps);
    assertEquals(3.5, actual, DELTA);
  }

}