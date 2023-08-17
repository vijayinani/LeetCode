package leetcode_51_to_100;

public class _80_RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        System.out.println(new _80_RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || nums[i - 2] < n) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
