class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int last = nums[0];
        int len = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != last) {
                nums[len] = nums[i];
                len++;
            }
            last = nums[i];
        }
        return len;
    }
}
