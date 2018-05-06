/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        dfs(root, sum, new ArrayList<Integer>());
        return res;
    }
    
    void dfs(TreeNode root, int sum, List<Integer> cur) {
        if (root == null) return;
        cur.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(cur));
        }
        dfs(root.left, sum-root.val, cur);
        dfs(root.right, sum-root.val, cur);
        cur.remove(cur.size()-1);
    }
}
