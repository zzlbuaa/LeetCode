# 144. Binary Tree Preorder Traversal

## Description

Given a binary tree, return the *preorder* traversal of its nodes' values.

**Example:**

```
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
```

**Follow up:** Recursive solution is trivial, could you do it iteratively?



## Solution 1: Traverse

```java
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
        helper(root, result);
        return result;
    }
    
    private void helper(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        
        result.add(root.val);
        helper(root.left, result);
        helper(root.right, result);
    }
}
```

## Solution 2: Iteratively

```java
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
            current = stack.pop();
            result.add(current.val);
            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
            
        }
        
        return result;
    }
}
```

