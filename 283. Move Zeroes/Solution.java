class Solution {
    public void moveZeroes(int[] nums) {
        int len = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                if(i != len) {
                    nums[len] = nums[i];
                    nums[i] = 0;
                }
                len++;
            }
        }
    }
}
