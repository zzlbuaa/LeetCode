class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
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
                if(i>start && candidates[i] == candidates[i-1]) continue;
                tmpList.add(candidates[i]);
                sum += candidates[i];
                backtracking(res, tmpList, sum, candidates, target, i+1);
                sum -= candidates[i];
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
