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
    public int res = 0;
    
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return res;
    }
    
    public void helper(TreeNode node, int cur) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            res += cur * 10 + node.val;
            return;
        }
        helper(node.left, cur * 10 + node.val);
        helper(node.right, cur * 10 + node.val);
    }
}
