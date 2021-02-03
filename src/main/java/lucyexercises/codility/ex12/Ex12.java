package lucyexercises.codility.ex12;

import java.util.HashMap;
import java.util.Map;

public class Ex12 {
    public int solution(String S) {
        if (S.length() < 6) {
            return 0;
        }
        Map<String, Integer> letterCounter = new HashMap<>();
        letterCounter.put("B", 0);
        letterCounter.put("A", 0);
        letterCounter.put("L", 0);
        letterCounter.put("O", 0);
        letterCounter.put("N", 0);

        for (int i = 0; i < S.length(); i++) {
            String letter = String.valueOf(S.charAt(i));
            if (letterCounter.containsKey(letter)) {
                letterCounter.put(letter, letterCounter.get(letter) + 1);
            }
        }

        int potentialNumOfBalloons = letterCounter.get("B");
        if (potentialNumOfBalloons == 0) {
            return 0;
        }
        if (letterCounter.get("A") < potentialNumOfBalloons) {
            potentialNumOfBalloons = letterCounter.get("A");
        }
        if (letterCounter.get("L")%2!=0) {
            letterCounter.put("L", letterCounter.get("L") - 1);
        }
        if (letterCounter.get("L")/2 < potentialNumOfBalloons) {
            potentialNumOfBalloons = letterCounter.get("L") / 2;
        }
        if (letterCounter.get("O")%2!=0) {
            letterCounter.put("O", letterCounter.get("O") - 1);
        }
        if (letterCounter.get("O")/2 < potentialNumOfBalloons) {
            potentialNumOfBalloons = letterCounter.get("O")/2;
        }
        if (letterCounter.get("N") < potentialNumOfBalloons) {
            potentialNumOfBalloons = letterCounter.get("N");
        }
        return potentialNumOfBalloons;
    }
}
