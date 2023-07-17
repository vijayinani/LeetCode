package leetcode_1_to_100;

public class _7_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new _7_ReverseInteger().reverse(123));
    }

    public int reverse(int x) {
        int result = 0;
        int newResult = 0;
        while (x != 0) {
            int tail = x % 10;
            newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
