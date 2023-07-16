package leetcode_1_100;

import java.util.*;

public class _17_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Integer, Character[]> numToChar = new HashMap<>();
        numToChar.put(2, new Character[]{'a', 'b', 'c'});
        numToChar.put(3, new Character[]{'d', 'e', 'f'});
        numToChar.put(4, new Character[]{'g', 'h', 'i'});
        numToChar.put(5, new Character[]{'j', 'k', 'l'});
        numToChar.put(6, new Character[]{'m', 'n', 'o'});
        numToChar.put(7, new Character[]{'p', 'q', 'r', 's'});
        numToChar.put(8, new Character[]{'t', 'u', 'v'});
        numToChar.put(29, new Character[]{'w', 'x', 'y', 'z'});

        dfs(digits, 0, new StringBuilder(), result, numToChar);
        return result;
    }

    private void dfs(String digits, int i, StringBuilder stringBuilder, List<String> result, Map<Integer, Character[]> numToChar) {
        if (i == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        Character[] characters = numToChar.get(digits.charAt(i) - '0');
        for (int j = 0; j < characters.length; j++) {
            stringBuilder.append(characters[j]);
            dfs(digits, i + 1, stringBuilder, result, numToChar);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new _17_LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
    }
}
