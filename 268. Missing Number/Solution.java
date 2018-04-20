class Solution {
    public int missingNumber(int[] nums) {
        int curr_sum = 0;
        int org_sum = 0;
        for(int i=0; i<nums.length; i++) {
            curr_sum += nums[i];
        }
        for(int i=0; i<nums.length+1; i++) {
            org_sum += i;
        }
        return org_sum - curr_sum;
    }
}
