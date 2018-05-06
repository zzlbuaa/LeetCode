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
    public List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return res;
    }
    
    public void helper(TreeNode node, String cur) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            cur += node.val;
            res.add(cur);
        }
        helper(node.left, cur + node.val + "->");
        helper(node.right, cur + node.val + "->");
    }
}
