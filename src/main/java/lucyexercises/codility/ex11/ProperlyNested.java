package lucyexercises.codility.ex11;

import java.util.LinkedList;
import java.util.List;

public class ProperlyNested {
    public int isProperlyNexted(String S) {
        if (S.length()%2 != 0) {
            return 0;
        }
        List<String> allChars = new LinkedList<>();

        for (int i = 0; i<S.length(); i++) {
            String symbol = String.valueOf(S.charAt(i));
            if (symbol.equals("{") || symbol.equals("[") || symbol.equals("(")) {
                allChars.add(symbol);
            } else if (allChars.size() == 0) { //first char is illegal
                return 0;
            } else if (symbol.equals(")")) {
                String startSymbol = allChars.remove(allChars.size() - 1);
                if (!startSymbol.equals("(")) {
                    return 0;
                }
            } else if (symbol.equals("]")) {
                String startSymbol = allChars.remove(allChars.size() - 1);
                if (!startSymbol.equals("[")) {
                    return 0;
                }
            } else if (symbol.equals("}")) {
                String startSymbol = allChars.remove(allChars.size() - 1);
                if (!startSymbol.equals("{")) {
                    return 0;
                }
            }
        }
        if (allChars.size() != 0) {
            return 0;
        }
        return 1;
    }
}
