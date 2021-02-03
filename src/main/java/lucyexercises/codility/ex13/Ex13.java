package lucyexercises.codility.ex13;

import java.util.HashMap;

public class Ex13 {
    public String solution(String S) {
//        Character lower = '-';
//        Character upper = '-';
        if (S.length() == 0) {
            return "NO";
        }
        HashMap<Character, Character> upper = new HashMap<>();
        HashMap<Character, Character> lower = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            Character letter = S.charAt(i);
            if (Character.isLowerCase(letter)) {
                lower.put(letter, letter);
            } else {
                upper.put(letter, letter);
            }
        }
        if (upper.isEmpty() || lower.isEmpty()) {
            return "NO";
        }
        char potentialMax = '-';
        for (int i = 0; i < upper.size(); i++) {

        }
        if (upper.equals('-') || lower.equals('-')) {
            return "NO";
        }
        if (upper.equals(lower)) {
            return String.valueOf(upper);
        } else {
            return "NO";
        }
    }
}
