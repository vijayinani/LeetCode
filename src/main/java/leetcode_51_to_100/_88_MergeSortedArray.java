package leetcode_51_to_100;

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] m1 = new int[]{1, 2, 3, 0, 0, 0};
        new _88_MergeSortedArray().merge(m1, 3, new int[]{2, 5, 6}, 3);
        for (int i : m1) {
            System.out.print(i + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
