package lucyexercises.codility.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PremutationTest {
    Premutation sol = new Premutation();

    @Test
    void testIsPremutation_1() {
        Assertions.assertEquals(0, sol.isPremutation(new int[]{2, 3, 1, 5}));
    }

    @Test
    void testIsPremutation_2() {
        Assertions.assertEquals(0, sol.isPremutation(new int[]{1, 1, 4}));
    }
}
