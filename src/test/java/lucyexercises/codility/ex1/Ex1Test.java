package lucyexercises.codility.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex1Test {
    Ex1 ex1Test = new Ex1();

    @Test
    void solutionTest_Neg() {
        int[] A = new int[]{2,2,2,2,2,3,4,4,4,6};
        Assertions.assertEquals(-1, ex1Test.solution(A));
    }

    @Test
    void solutionTest_Pos() {
        int[] A = new int[]{1,1,1,1,50};
        Assertions.assertEquals(1, ex1Test.solution(A));
    }

    @Test
    void solutionTest_Neg_2() {
        int[] A = new int[]{1,1,1,2,50};
        Assertions.assertEquals(1, ex1Test.solution(A));
    }

    @Test
    void solutionTest_Pos_3() {
        int[] A = new int[]{1,4,6,6,6,7};
        Assertions.assertEquals(-1, ex1Test.solution(A));
    }
}
