package leetcode_1_to_50;

public class _43_MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = multiply + result[p2];
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int val : result) {
            if (val != 0 || sb.length() != 0) {
                sb.append(val);
            }
        }

        if (sb.length() == 0) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
