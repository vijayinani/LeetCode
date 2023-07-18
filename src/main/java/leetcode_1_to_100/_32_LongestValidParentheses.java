package leetcode_1_to_100;

import java.util.Stack;

public class _32_LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(new _32_LongestValidParentheses().longestValidParentheses("((())))(())))("));
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> integerStack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                integerStack.push(i);
            } else {
                if (!integerStack.empty()) {
                    if (s.charAt(integerStack.peek()) == '(') {
                        integerStack.pop();
                    } else {
                        integerStack.push(i);
                    }
                } else {
                    integerStack.push(i);
                }
            }
        }
        if (integerStack.empty()) {
            return n;
        }

        int start = 0;
        int end = n;
        int longest = 0;

        while (!integerStack.empty()) {
            start = integerStack.pop();
            longest = Math.max(longest, end - start - 1);
            end = start;
        }

        longest = Math.max(longest, start);
        return longest;
    }
}
