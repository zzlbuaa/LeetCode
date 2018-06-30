class Solution {
    public int rob(int[] nums) {
        int[] f = new int[nums.length];
        int res = 0;
        for(int j=0; j<nums.length; j++) {
            f[j] = nums[j];
            if(j<2) continue;
            int maxf = 0;
            for(int i=0; i<j-1; i++) {
                if(f[i] > maxf) maxf = f[i];
            }
            f[j] += maxf;
        }
        for(int i=0; i<nums.length; i++) {
            res = Math.max(res, f[i]);
        }
        return res;
    }
}
