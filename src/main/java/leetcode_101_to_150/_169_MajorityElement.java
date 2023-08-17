package leetcode_101_to_150;

public class _169_MajorityElement {
    public static void main(String[] args) {
        System.out.println(new _169_MajorityElement().majorityElement(new int[]{3, 1, 4, 9, 6, 3, 2, 3, 3, 3, 9, 2, 9, 9, 9, 3, 3}));
    }

//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        if (nums.length < 1) {
//            return nums[0];
//        }
//        return nums[nums.length / 2 + 1];
//    }

//    public int majorityElement(int[] num) {
//
//        int major = num[0], count = 1;
//        for (int i = 1; i < num.length; i++) {
//            if (count == 0) {
//                count++;
//                major = num[i];
//            } else if (major == num[i]) {
//                count++;
//            } else count--;
//
//        }
//        return major;
//    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int ret = 0;
        for (int num : nums) {
            if (count == 0) {
                ret = num;
            }

            if (ret == num) {
                count++;
            } else {
                count--;
            }
        }
        return ret;
    }
}
