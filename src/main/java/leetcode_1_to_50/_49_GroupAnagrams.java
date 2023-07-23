package leetcode_1_to_50;

import java.util.*;

public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            int[] presentChars = new int[26];
            for (char c : s.toCharArray()) {
                presentChars[c - 'a']++;
            }
            String keyStr = Arrays.toString(presentChars);
            if (!anagrams.containsKey(keyStr)) anagrams.put(keyStr, new ArrayList<>());
            anagrams.get(keyStr).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
