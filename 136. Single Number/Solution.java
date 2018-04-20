class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int pos=0; pos<nums.length; pos++) {
            result ^= nums[pos];
        }
        return result;
    }
}