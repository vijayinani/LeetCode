package leetcode_1_to_100;

public class _6_ZigzagConversion {

    public static void main(String[] args) {
        System.out.println(new _6_ZigzagConversion().convert("PAYPALISHIRING", 3));
    }

    public String convert(String s, int numRows) {

        int n = s.length();

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int i = 0;
        while (i < n) {
            for (int j = 0; j < numRows && i < n; j++) {
                sb[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < n; j--) {
                sb[j].append(s.charAt(i++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sbCurr : sb) {
            result.append(sbCurr);
        }
        return result.toString();
    }
}
