package leetcode_1_to_50;

public class _5_LongestPalindromicSubstring {
    /*public String longestPalindrome(String s) {
        int n = s.length();
        int startIndex = 0;
        int maxLength = 0;
        boolean dp[][] = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (j - i + 1 > maxLength)) {
                    startIndex = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }*/

    int maxLength = 0;
    int startIndex = 0;

    public static void main(String[] args) {
        System.out.println(new _5_LongestPalindromicSubstring().longestPalindrome("ababd"));
    }

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            check(s, i, i);
            check(s, i, i + 1);
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    private void check(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        if (maxLength < end - begin - 1) {
            startIndex = begin + 1;
            maxLength = end - begin - 1;
        }
    }
}
