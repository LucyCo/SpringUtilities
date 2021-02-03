package lucyexercises.codility.ex11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProperlyNestedTest {
    ProperlyNested sol = new ProperlyNested();

    @Test
    void testIsProperlyNested() {
        Assertions.assertEquals(0, sol.isProperlyNexted("([)()]"));
    }

    @Test
    void testIsProperlyNested2() {
        Assertions.assertEquals(1, sol.isProperlyNexted("{[()()]}"));
    }

    @Test
    void testIsProperlyNested3() {
        Assertions.assertEquals(0, sol.isProperlyNexted("){{}}"));
    }

    @Test
    void testIsProperlyNested4() {
        Assertions.assertEquals(1, sol.isProperlyNexted("{}([()]){[()()]}"));
    }

    @Test
    void testIsProperlyNested5() {
        Assertions.assertEquals(1, sol.isProperlyNexted(""));
    }
}
