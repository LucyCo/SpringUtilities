package lucyexercises.codility.ex6;

import java.util.HashMap;
import java.util.Map;

public class FrogSkip {
    public int CalcEarliestJump(int steps, int[] A) {
        Map<Integer, Integer> allSteps = new HashMap<>();
        for (int i = 0; i < A.length ; i++) {
            int currentStep = A[i];
            if (allSteps.get(currentStep) == null) {
                allSteps.put(currentStep, currentStep);
            }
            if (allSteps.size() == steps) {
                return i;
            }
        }
        return -1;
    }
}
