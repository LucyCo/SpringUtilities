package lucyexercises.codility.ex9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrossingCarsTest {
    CrossingCars sol = new CrossingCars();

    @Test
    void testGetNumberCrossing() {
        Assertions.assertEquals(5, sol.getNumberCrossing(new int[]{0,1,0,1,1}));
    }

    @Test
    void testGetNumberCrossing1() {
        Assertions.assertEquals(2, sol.getNumberCrossing(new int[]{1,1,0,1,1,0}));
    }

    @Test
    void testGetNumberCrossing2() {
        Assertions.assertEquals(6, sol.getNumberCrossing(new int[]{0,0,0,1,1,0}));
    }
}
