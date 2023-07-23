package leetcode_1_to_50;

public class _38_CountAndSay {
    public static void main(String[] args) {
        System.out.println(new _38_CountAndSay().countAndSay(5));
    }

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = findIndex(s);
        }
        return s;
    }

    private String findIndex(String s) {
        StringBuilder sb = new StringBuilder();
        char curr = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                count++;
            } else {
                sb.append(count);
                sb.append(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(curr);
        return sb.toString();
    }
}
