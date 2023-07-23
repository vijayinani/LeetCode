package leetcode_1_to_50;

public class _27_RemoveElement {
    public static void main(String[] args) {
        System.out.println(new _27_RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(new _27_RemoveElement().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }

}
