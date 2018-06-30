class Solution {
    public int max(int a, int b) {
        if(a>b) {
            return a;
        }
        return b;
    }
    
    public int min(int a, int b) {
        if(a<b) {
            return a;
        }
        return b;
    }
    
    public int maxProduct(int[] nums) {
        int[] f = new int[nums.length];
        int[] g = new int[nums.length];
        int res = nums[0];
        
        for(int j=0; j<nums.length; j++) {
            f[j] = nums[j];
            g[j] = nums[j];
            if(j>0) {
                f[j] = max(f[j],nums[j]*f[j-1]);
                f[j] = max(f[j],nums[j]*g[j-1]);
                g[j] = min(g[j],nums[j]*f[j-1]);
                g[j] = min(g[j],nums[j]*g[j-1]);
            }
            if(f[j]>res) {
                res = f[j];
            }
        }
        return res;
    }
}
