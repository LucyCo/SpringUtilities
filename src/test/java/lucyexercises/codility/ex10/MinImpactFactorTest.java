package lucyexercises.codility.ex10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinImpactFactorTest {
    MinImpactFactor sol = new MinImpactFactor();

    @Test
    void testGetMinFactor() {
        Assertions.assertArrayEquals(new int[]{2,4,1}, sol.findMinImpactFactor("CAGCCTA", new int[] {2,5,0}, new int[]{4,5,6}));
    }

    @Test
    void testGetMinFactor2() {

        Assertions.assertArrayEquals(new int[]{2,1,1}, sol.findMinImpactFactor("CAGCCTA", new int[] {2,5,6}, new int[]{4,6,6}));
    }

    @Test
    void testGetMinFactor1() {
        Assertions.assertArrayEquals(new int[]{4,4,4}, sol.findMinImpactFactor("TTTTTTTTT", new int[] {2,5,0}, new int[]{4,5,6}));
    }
}
