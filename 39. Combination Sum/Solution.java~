class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), 0, candidates, target, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> tmpList, int sum, int[] candidates, int target, int start) {
        if(sum == target) {
            res.add(new ArrayList(tmpList));
        }
        if(sum > target) {
            return;
        }
        else {
            for (int i=start; i<candidates.length; i++) {
                tmpList.add(candidates[i]);
                sum += candidates[i];
                backtracking(res, tmpList, sum, candidates, target, i);
                sum -= candidates[i];
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
