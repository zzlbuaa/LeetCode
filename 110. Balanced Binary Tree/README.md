# 110. Balanced Binary Tree

## Description

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

> a binary tree in which the depth of the two subtrees of *every* node never differ by more than 1.

**Example 1:**

Given the following tree `[3,9,20,null,null,15,7]`:

```
    3
   / \
  9  20
    /  \
   15   7
```

Return true.
**Example 2:**

Given the following tree `[1,2,2,3,3,null,null,4,4]`:

```
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
```

Return false.



## Solution 1: Divide & Conquer

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
    
    private int NOT_BALANCED = -1;
    
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != NOT_BALANCED;
    }
    
    private int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        if(left == NOT_BALANCED || right == NOT_BALANCED) {
            return NOT_BALANCED;
        }
        
        if(Math.abs(left - right) > 1) {
            return NOT_BALANCED;
        }
        
        return Math.max(left, right) + 1;
    }
}
```



## Solution 2: Divide & Conquer returning ResultType

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
    
    class ResultType {
        boolean isBalanced;
        int depth;
        public ResultType(boolean isBalanced, int depth) {
            this.isBalanced = isBalanced;
            this.depth = depth;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root).isBalanced;
    }
    
    private ResultType maxDepth(TreeNode root) {
        if(root == null) {
            return new ResultType(true, 0);
        }
        ResultType left = maxDepth(root.left);
        ResultType right = maxDepth(root.right);
        
        if(!left.isBalanced || !right.isBalanced) {
            return new ResultType(false, -1);
        }
        
        if(Math.abs(left.depth - right.depth) > 1) {
            return new ResultType(false, -1);
        }
        
        return new ResultType(true, Math.max(left.depth, right.depth) + 1);
    }
}
```

