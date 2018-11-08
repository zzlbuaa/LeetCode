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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(current);
        while(!stack.isEmpty()) {
            current = stack.peek();
            if(current.left != null) {
                stack.push(current.left);
            }
            else {
                //stack pop前注意要判断empty stack
                while(current.right == null && !stack.isEmpty()) {
                    current = stack.pop();
                    result.add(current.val);
                }
                if(current.right != null) {
                    current = stack.pop();
                    result.add(current.val);
                    current = current.right;
                    if(current.left != null) {
                        stack.push(current.left);
                        stack.push(current);
                    }
                    else {
                        result.add(current.val);
                        stack.push(current);
                    }
                }
            }
        }
        
        return result;
    }
}
