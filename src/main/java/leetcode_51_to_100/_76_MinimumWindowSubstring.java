package leetcode_51_to_100;

public class _76_MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(new _76_MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty() ||
                s.length() < t.length()) {
            return "";
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        char[] chS = s.toCharArray();
        while (end < chS.length) {
            if (map[chS[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (map[chS[start++]]++ == 0) {
                    count++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" :
                new String(chS, startIndex, minLen);
    }
}
