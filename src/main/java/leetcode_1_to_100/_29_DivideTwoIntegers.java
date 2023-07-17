package leetcode_1_to_100;

public class _29_DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(new _29_DivideTwoIntegers().divide(7, -3));
    }

    private static int divideLong(long dividend, long divisor) {
        boolean negative = (dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0);
        int result = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        long originalDivisor = divisor;
        while (divisor <= dividend) {
            divisor += originalDivisor;
            if (negative) {
                result--;
            } else {
                result++;
            }
        }
        return result;
    }

    public int divide(int dividend, int divisor) {
        long result = divideLong(dividend, divisor);
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) result;
        }
    }
}
