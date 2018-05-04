class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n==0) return res;
        dfs(0, 0, n, "");
        return res;
    }
    
    public void dfs(int l, int r, int n, String cur) {
        if (l == n && r == n) {
            res.add(cur);
            return;
        }
        if (l < n) dfs(l+1, r, n, cur+"(");
        if (r < l) dfs(l, r+1, n, cur+")");
    }
}
