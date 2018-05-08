class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), 1, n, k);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> tmpList, int start, int n, int k) {
        if (tmpList.size() == k) {
            res.add(new ArrayList(tmpList));
        }
        else {
            for(int i=start; i<=n; i++) {
                tmpList.add(i);
                backtracking(res, tmpList, i+1, n, k);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
