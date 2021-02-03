package lucyexercises.codility.ex12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex12Test {
    Ex12 sol = new Ex12();

    @Test
    void testSolution() {
        Assertions.assertEquals(1, sol.solution("BAONXXOLL"));
    }

    @Test
    void testSolution2() {
        Assertions.assertEquals(2, sol.solution("BAOOLLNNOLOLGBAX"));
    }

    @Test
    void testSolution3() {
        Assertions.assertEquals(1, sol.solution("ONLABLABLOON"));
    }
}
