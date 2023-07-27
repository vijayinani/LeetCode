package leetcode_51_to_100;

public class _67_AddBinary {
    public static void main(String[] args) {
        System.out.println(new _67_AddBinary().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            sum = sum / 2;
        }
        if (sum != 0) {
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}
