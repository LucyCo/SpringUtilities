package lucyexercises.codility.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinNumberOfStepsTest {
    MinNumberOfSteps sol = new MinNumberOfSteps();

    @Test
    void testSolution_1() {
        Assertions.assertEquals(2, sol.solution(2, 10, 6));
    }

    @Test
    void testSolution_2() {
        Assertions.assertEquals(7, sol.solution(-3, 10, 2));
    }
}
