package leetcode_1_to_50;

public class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(new _26_RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(new _26_RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 2}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int i = 0;
        int j = 1;
        int n = nums.length;
        int count = 1;
        while (j < n) {
            if (nums[i] != nums[j]) {
                count++;
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return count;
    }
}
