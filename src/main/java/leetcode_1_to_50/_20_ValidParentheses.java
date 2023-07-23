package leetcode_1_to_50;

import java.util.Stack;

public class _20_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new _20_ValidParentheses().isValid("{}[]()"));
    }

    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == '}' && !parenthesis.isEmpty() && parenthesis.peek().equals('{')) {
                parenthesis.pop();
            } else if (item == ']' && !parenthesis.isEmpty() && parenthesis.peek().equals('[')) {
                parenthesis.pop();
            } else if (item == ')' && !parenthesis.isEmpty() && parenthesis.peek().equals('(')) {
                parenthesis.pop();
            } else {
                parenthesis.push(item);
            }
        }
        return parenthesis.isEmpty();
    }
}
