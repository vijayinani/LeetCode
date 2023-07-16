package leetcode;

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int water = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            water = Math.max(water, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j])
                j--;
            else
                i++;
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println(new _11_ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
