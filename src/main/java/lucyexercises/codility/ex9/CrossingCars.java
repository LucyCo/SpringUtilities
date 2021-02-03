package lucyexercises.codility.ex9;

public class CrossingCars {

    public int getNumberCrossing(int[] A) {
        int carPairs = 0;
        int eastCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                carPairs += eastCount;
            }
            if (A[i] == 0) {
               eastCount++;
            }
        }
        if (carPairs > Math.pow(10,9)) {
            return -1;
        }
        return carPairs;
    }
}
