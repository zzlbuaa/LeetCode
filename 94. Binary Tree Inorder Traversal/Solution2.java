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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        boolean done = false;
        while(!done) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            }
            else {
                if(!stack.isEmpty()) {
                    current = stack.pop();
                    result.add(current.val);
                    
                    current = current.right;
                }
                else {
                    done = true;
                }
            }
        }
        
        return result;
    }
}
