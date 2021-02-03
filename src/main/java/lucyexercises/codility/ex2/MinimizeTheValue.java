package lucyexercises.codility.ex2;

import java.util.Arrays;

public class MinimizeTheValue {
    int minimize(int[] a) {
        int rightSum = Arrays.stream(a).sum();
        int leftSum = 0;
        int prevSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            leftSum += a[i];
            rightSum -= a[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if (currentDiff == 0) return 0;
            else if (prevSum > currentDiff) {
                prevSum = currentDiff;
            }
        }
        return prevSum;
    }
}
