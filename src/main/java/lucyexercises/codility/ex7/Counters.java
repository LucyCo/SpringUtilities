package lucyexercises.codility.ex7;

public class Counters {
    public int[] updateCounters(int[] A, int X) {
        int[] statusCounters = new int[X];
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            int counterNum = A[i];
            if (counterNum <= X) {
                int currentCount = ++statusCounters[counterNum-1];
                if (currentCount > maxCounter) {
                    maxCounter = currentCount;
                }
            } else {
                for (int k = 0; k < X; k++) {
                    statusCounters[k] = maxCounter;
                }
            }
        }
        return statusCounters;
    }
}
