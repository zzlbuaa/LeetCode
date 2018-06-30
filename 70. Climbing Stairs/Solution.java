class Solution {
    public int climbStairs(int n) {
        int[] f = new int[n];
        for(int j=0; j<n; j++) {
            if(j<2) f[j]=j+1;
            else {
                f[j] = f[j-1] + f[j-2];
            }
        }
        return f[n-1];
    }
}
