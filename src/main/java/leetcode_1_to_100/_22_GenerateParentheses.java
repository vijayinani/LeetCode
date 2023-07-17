package leetcode_1_to_100;

import java.util.ArrayList;
import java.util.List;

public class _22_GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(new _22_GenerateParentheses().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, 0, 0, "", n);
        return result;
    }

    private void backtrack(List<String> result, int open, int close, String s, int max) {

        if (s.length() == max * 2) {
            result.add(s);
        }

        if (open < max) {
            backtrack(result, open + 1, close, s + "(", max);
        }
        if (close < open) {
            backtrack(result, open, close + 1, s + ")", max);
        }
    }
}
