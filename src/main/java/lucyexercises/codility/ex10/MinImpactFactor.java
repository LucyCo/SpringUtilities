package lucyexercises.codility.ex10;

public class MinImpactFactor {
    public int[] findMinImpactFactor(String s, int[] P, int[] Q) {
        int numOfCommands = P.length;
        int numOfLetters = s.length();
        int[] A = new int[numOfLetters];
        int[] C = new int[numOfLetters];
        int[] G = new int[numOfLetters];
        int[] T = new int[numOfLetters];

        for (int i = 0; i < numOfLetters; i++) {
            A[i] = s.charAt(i) == 'A' ? 1 : 0;
            C[i] = s.charAt(i) == 'C' ? 1 : 0;
            G[i] = s.charAt(i) == 'G' ? 1 : 0;
            T[i] = s.charAt(i) == 'T' ? 1 : 0;
        }

        int[] result = new int[numOfCommands];
        int index = 0;
        for (int i = 0; i < numOfCommands; i++) {
            if (P[i] == 0) {
                if (A[Q[i]] > 0) { result[index++] = 1; continue; }
                if (C[Q[i]] > 0) { result[index++] = 2; continue; }
                if (G[Q[i]] > 0) { result[index++] = 3; continue; }
                if (T[Q[i]] > 0) { result[index++] = 4; }
            } else {
                if ((A[Q[i]] - A[P[i] - 1]) > 0) { result[index++] = 1; continue; }
                if ((C[Q[i]] - C[P[i] - 1]) > 0) { result[index++] = 2; continue; }
                if ((G[Q[i]] - G[P[i] - 1]) > 0) { result[index++] = 3; continue; }
                if ((T[Q[i]] - T[P[i] - 1]) > 0) { result[index++] = 4; }
            }
        }
        return result;
    }
}
