package lucyexercises.codility.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimizeTheValueTest {
    MinimizeTheValue minValueCalc = new MinimizeTheValue();

    @Test
    void minimize_Pos() {
        Assertions.assertEquals(2, minValueCalc.minimize(new int[]{1,2,3,4}));
    }

    @Test
    void minimize_Pos1() {
        Assertions.assertEquals(9, minValueCalc.minimize(new int[]{0,50,-60,0,-1}));
    }
}
