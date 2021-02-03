package lucyexercises.codility.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountersTest {
    Counters sol = new Counters();

    @Test
    void testCounterStatusUpdate() {
        int[] expectedArr = new int[] {3,2,2,4,2};
        Assertions.assertArrayEquals(expectedArr, sol.updateCounters(new int[]{3,4,4,6,1,4,4}, 5));
    }

    @Test
    void testCounterStatusUpdate1() {
        int[] expectedArr = new int[] {3,1,1,2,1};
        Assertions.assertArrayEquals(expectedArr, sol.updateCounters(new int[]{6,1,3,6,1,1,4}, 5));
    }
}
