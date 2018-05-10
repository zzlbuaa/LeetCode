class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int k, int n, int start) {
        if(n == 0 && k == 0) res.add(new ArrayList(tempList));
        else if(n < 0) return;
        else {
            for(int i=start; i<=9; i++) {
                tempList.add(i);
                backtrack(res, tempList, k-1, n-i, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
