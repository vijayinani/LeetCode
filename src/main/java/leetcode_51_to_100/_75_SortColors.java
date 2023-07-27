package leetcode_51_to_100;

public class _75_SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        for (int i = low; i <= high; i++) {
            if (nums[i] == 0) {
                int temp = nums[low];
                nums[low] = nums[i];
                nums[i] = temp;
                i++;
                low++;
            } else if (nums[i] == 2) {
                int temp = nums[high];
                nums[high] = nums[i];
                nums[i] = temp;
                high--;
            } else {
                i++;
            }
        }
    }
}
