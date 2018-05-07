class Solution {
    public List<List<Integer>> results = new ArrayList<>();
    public boolean[] used;
    public List<Integer> solution = new ArrayList<>();
    public int size;
    public int[] candidates;
    
    public List<List<Integer>> permute(int[] nums) {
        candidates = nums;
        size = nums.length;
        used = new boolean[size];
        backtrack(0);
        return results;
    }
    
    public void backtrack(int n) {
        if (n == size) {
            results.add(new ArrayList(solution));
            return;
        }
        for(int i=0; i<size; i++) {
            if (!used[i]) {
                used[i] = true;
                solution.add(candidates[i]);
                backtrack(n+1);
                used[i] = false;
                solution.remove(solution.size()-1);
            }
        }
    }

}
