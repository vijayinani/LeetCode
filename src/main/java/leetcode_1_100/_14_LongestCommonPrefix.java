package leetcode_1_100;

public class _14_LongestCommonPrefix {
/*    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return first.substring(0, i);
    }*/

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(pre)) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println(new _14_LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new _14_LongestCommonPrefix().longestCommonPrefix(new String[]{""}));
    }
}
