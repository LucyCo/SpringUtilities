package lucyexercises.TestSumObjective;

import lucyexercises.SumObjective.ArraySumObjective;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySumObjectiveTest {

    ArraySumObjective calc = new ArraySumObjective();

    @Test
    void testIsSumObjectiveAchieved_positiveCases() {
        int[] array1 = new int[]{3,4,-5,2,3};
        int[] array2 = new int[]{1,1,0,1,1,1,1,1};
        int[] array3 = new int[]{-1,1,2,5};
        List<int[]> listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertTrue(calc.isSumObjectiveAchieved(listArrays));

        array1 = new int[]{1,2,0,0,5,1};
        array2 = new int[]{-1,4,0,0,4,1,1};
        array3 = new int[]{0,3,0,0,3,1,2};
        listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertTrue(calc.isSumObjectiveAchieved(listArrays));

    }

    @Test
    void testIsSumObjectiveAchieved_negativeCase() {
        int[] array1 = new int[]{3,4,-5,2,3};
        int[] array2 = new int[]{1,1,0,1,1,1,1,1};
        int[] array3 = new int[]{-1,3,2,5};
        List<int[]> listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertFalse(calc.isSumObjectiveAchieved(listArrays));

        array1 = new int[]{1,2,0,0,5,1};
        array2 = new int[]{-1,4,0,0,4,1,1};
        array3 = new int[]{0,3,0,0,3,5,2};
        listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertFalse(calc.isSumObjectiveAchieved(listArrays));

        array1 = new int[]{1,2,0,0,5,1};
        array2 = new int[]{-1,4,0,0,4,1,1};
        array3 = new int[]{0,3};
        listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertFalse(calc.isSumObjectiveAchieved(listArrays));
    }

    @Test
    void testIsSumObjectiveAchieved_ListEmpty() {
        Assertions.assertFalse(calc.isSumObjectiveAchieved(new ArrayList<int[]>(){}));
    }

    @Test
    void testIsSumObjectiveAchieved_ListNull() {
        Assertions.assertFalse(calc.isSumObjectiveAchieved(null));
    }

    @Test
    void testIsSumObjectiveAchieved_EmptyOneArray() {
        int[] array1 = new int[]{3,4,-5,2,3};
        int[] array2 = new int[]{};
        int[] array3 = new int[]{-1,3,2,5};
        List<int[]> listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertFalse(calc.isSumObjectiveAchieved(listArrays));
    }

    @Test
    void testIsSumObjectiveAchieved_EmptyAllArrays() {
        int[] array1 = new int[]{};
        int[] array2 = new int[]{};
        int[] array3 = new int[]{};
        List<int[]> listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertTrue(calc.isSumObjectiveAchieved(listArrays));
    }

    @Test
    void testIsSumObjectiveAchieved_AllZeros() {
        int[] array1 = new int[]{0,0,0,0};
        int[] array2 = new int[]{0,0};
        int[] array3 = new int[]{0,0,0,0,0,0,0};
        List<int[]> listArrays = Arrays.asList(array1, array2, array3);
        Assertions.assertTrue(calc.isSumObjectiveAchieved(listArrays));
    }
}
