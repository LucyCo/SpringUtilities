package lucyexercises.codility.ex5;

import java.util.HashMap;
import java.util.Map;

public class Premutation {

    int isPremutation(int[] A) {
        int len = A.length;
        Map<Integer, Integer> allValues = new HashMap<>();
        for (int a : A) {
            if (a > len) return 0;
            if (allValues.get(a) == null) {
                allValues.put(a, a);
            } else {
                return 0;
            }
        }
      return 1;
    }
}
