package leetcode_51_to_100;

import java.util.Stack;

public class _71_SimplifyPath {
    public static void main(String[] args) {
        System.out.println(new _71_SimplifyPath().simplifyPath("/home//foo/"));
    }

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') continue;
            StringBuilder sb = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/') {
                sb.append(path.charAt(i));
                i++;
            }
            if (sb.toString().equals(".")) {
                continue;
            }
            if (!stack.empty() && sb.toString().equals("..")) {
                stack.pop();
            } else {
                if (!sb.toString().equals("..")) {
                    stack.push(sb.toString());
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.empty()) {
            result.insert(0, "/" + stack.pop());

        }
        if (result.length() == 0) {
            return "/";
        }
        return result.toString();
    }
}
