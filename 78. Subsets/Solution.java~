class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tmpList, int[] nums, int start) {
        res.add(new ArrayList(tmpList));
        for(int i=start; i<nums.length; i++) {
            tmpList.add(nums[i]);
            backtrack(res, tmpList, nums, i+1);
            tmpList.remove(tmpList.size()-1);
        }
    }
}
