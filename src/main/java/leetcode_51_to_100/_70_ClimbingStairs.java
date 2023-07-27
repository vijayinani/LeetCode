package leetcode_51_to_100;

public class _70_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new _70_ClimbingStairs().climbStairs(5));
    }

    public int climbStairs(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 1;
        int b = 1;
        int types = 0;
        for (int i = 2; i <= n; i++) {
            types = a + b;
            a = b;
            b = types;
        }
        return types;
    }
}
