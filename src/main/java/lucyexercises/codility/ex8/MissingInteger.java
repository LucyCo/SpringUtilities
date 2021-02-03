package lucyexercises.codility.ex8;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
    public int findMissingInteger(int[] A) {
        Map<Integer, Integer> allInts = new HashMap<>();
        int highestVal = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int currentVal = A[i];
            if (currentVal > highestVal) {
                highestVal = currentVal;
            }
            if (allInts.get(currentVal) == null) {
                allInts.put(currentVal, currentVal);
            }
        }
        if (highestVal < 1) {
            return 1;
        }
        for (int i = 1; i <= highestVal; i++) {
            if (allInts.get(i) == null) {
                return i;
            }
        }
    return highestVal + 1;
    }
}
