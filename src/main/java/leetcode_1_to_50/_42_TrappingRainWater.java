package leetcode_1_to_50;

public class _42_TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(new _42_TrappingRainWater().trap(new int[]{6, 5, 4, 8, 2, 7}));
    }

    public int trap(int[] height) {

        if (height.length < 3) {
            return 0;
        }

        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    maxWater = maxWater + maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    maxWater = maxWater + maxRight - height[right];
                }
                right--;
            }
        }

        return maxWater;
    }
}
