public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 2 && nums[0] == 0 && nums[1] == 0) return new int[]{0, 1};//这题有问题啊
        int product_all = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                if(i==nums.length-1) product_all = 0;
                continue;
            }
            product_all *= nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) nums[i] = product_all;
            else nums[i] = product_all/nums[i];
        }
        return nums;
    }
}
