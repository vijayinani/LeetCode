package leetcode_1_to_50;

public class _31_NextPermutation {

    // https://leetcode.com/problems/next-permutation/solutions/13867/c-from-wikipedia/comments/14266

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 6, 5, 4, 1};
        new _31_NextPermutation().nextPermutation(input);
        for (int i : input)
            System.out.print(i + " ");
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p = -1;
        int pv = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                pv = nums[i];
                break;
            }
        }

        if (p == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > pv) {
                swap(nums, p, i);
                break;
            }
        }

        reverse(nums, p + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
