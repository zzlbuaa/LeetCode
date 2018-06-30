class Solution {
    public int maxSubArray(int[] nums) {
        int[] f = new int[nums.length];
        int res=nums[0];
        for(int j=0; j<nums.length; j++) {
            f[j] = nums[j];
            //转移方程：f[j] = max(nums[j],nums[j]+f[j-1])
            if(j>0 && f[j-1]+nums[j]>f[j]) {
                f[j] = f[j-1] + nums[j];
            }
            res = Math.max(res,f[j]);
        }
        return res;        
    }
    
    
}
