package leetcode_1_100;

public class _4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(new _4_MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4, 9, 11}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean even = (nums1.length + nums2.length) % 2 == 0;
        int minIndex = 0;
        int i = 0;
        int j = 0;
        int currVal = Integer.MIN_VALUE;
        int preVal = Integer.MIN_VALUE;
        int maxIndex = (nums1.length + nums2.length) / 2;
        while (minIndex <= maxIndex) {
            preVal = currVal;
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    currVal = nums1[i];
                    i++;
                } else {
                    currVal = nums2[j];
                    j++;
                }
            } else if (i < nums1.length) {
                currVal = nums1[i];
                i++;
            } else {
                currVal = nums2[j];
                j++;
            }

            minIndex++;
        }
        return even ? (preVal + currVal) / 2.0 : currVal;
    }
}
