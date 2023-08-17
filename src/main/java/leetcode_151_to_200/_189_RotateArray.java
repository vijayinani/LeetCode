package leetcode_151_to_200;

public class _189_RotateArray {
    public static void main(String[] args) {
        new _189_RotateArray().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

//    public void rotate(int[] nums, int k) {
//        int[] temp = new int[nums.length];
//        int i = 0;
//        int start = k;
//        while (start < nums.length) {
//            temp[start] = nums[i];
//            i++;
//            start++;
//        }
//        start = 0;
//        while (start < k) {
//            temp[start] = nums[i];
//            i++;
//            start++;
//        }
//        for (int x = 0; x < nums.length; x++) {
//            nums[x] = temp[x];
//        }
//    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
