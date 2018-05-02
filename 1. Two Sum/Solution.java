class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int firstPos=0; firstPos<nums.length-1; firstPos++) {
            for (int secondPos=firstPos+1; secondPos<nums.length; secondPos++) {
                int sum = nums[firstPos] + nums[secondPos];
                if (sum == target) {
                    indices[0] = firstPos;
                    indices[1] = secondPos;
                    return indices;
                }
            }
        }
        return indices;
    }
}
