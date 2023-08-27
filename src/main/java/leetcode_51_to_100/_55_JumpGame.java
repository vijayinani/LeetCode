package leetcode_51_to_100;

public class _55_JumpGame {

//    public boolean canJump(int[] nums) {
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i > max) {
//                return false;
//            }
//
//            max = Math.max(i + nums[i], max);
//
//        }
//        return true;
//    }

    public boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }
        return i == nums.length;
    }

}
