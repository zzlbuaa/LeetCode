class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int p = 1, i = 0; i < nums.length; p *= nums[i++]) {
            result[i] = p;
        }
        for (int p = 1, i = nums.length - 1; i >= 0; p *= nums[i--]) {
            result[i] *= p;
        }
        return result;
    }
}
