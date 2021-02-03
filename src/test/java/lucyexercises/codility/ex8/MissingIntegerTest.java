package lucyexercises.codility.ex8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingIntegerTest {
    MissingInteger sol = new MissingInteger();

    @Test
    void testFindMissingInteger() {
        Assertions.assertEquals(5, sol.findMissingInteger(new int[]{1,3,6,4,1,2}));
    }

    @Test
    void testFindMissingInteger2() {
        Assertions.assertEquals(4, sol.findMissingInteger(new int[]{1,2,3}));
    }

    @Test
    void testFindMissingInteger3() {
        Assertions.assertEquals(1, sol.findMissingInteger(new int[]{-1,-3}));
    }

    @Test
    void testFindMissingInteger4() {
        Assertions.assertEquals(1, sol.findMissingInteger(new int[]{-50,5,-45}));
    }

    @Test
    void testFindMissingInteger5() {
        Assertions.assertEquals(1, sol.findMissingInteger(new int[]{0,-3}));
    }
}
