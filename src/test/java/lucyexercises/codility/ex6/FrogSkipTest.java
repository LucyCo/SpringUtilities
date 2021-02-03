package lucyexercises.codility.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrogSkipTest {
    FrogSkip sol = new FrogSkip();
    @Test
    @DisplayName("testFrogSkipCalc")
    void testFrogSkipCalc() {
        Assertions.assertEquals(6, sol.CalcEarliestJump(5, new int[]{1,3,1,4,2,3,5,3}));
    }

    @Test
    @DisplayName("testFrogSkipCalc1")
    void testFrogSkipCalc_1() {
        Assertions.assertEquals(10, sol.CalcEarliestJump(5, new int[]{5,1,1,1,1,3,3,5,2,3,4,5,1}));
    }

    @Test
    @DisplayName("testFrogSkipCalc2")
    void testFrogSkipCalc_2() {
        Assertions.assertEquals(-1, sol.CalcEarliestJump(5, new int[]{5,1,1,1,1,3,3,5,2,3,5,1}));
    }
}
