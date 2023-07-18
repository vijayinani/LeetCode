package leetcode_1_to_100;

public class _33_SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(new _33_SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int start = low;
        low = 0;
        high = nums.length - 1;

        if (target >= nums[start] && target <= nums[high]) {
            low = start;
        } else {
            high = start;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
