package lucyexercises.codility.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMissingValTest {
    FindMissingVal sol = new FindMissingVal();

    @Test
    void testSolution_1() {
        Assertions.assertEquals(4, sol.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    void testSolution_2() {
        Assertions.assertEquals(8, sol.solution(new int[]{3,6,10,7,1,9,2,5,4}));
    }
}
