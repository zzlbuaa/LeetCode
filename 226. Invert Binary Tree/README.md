# 226. Invert Binary Tree

### Description

Invert a binary tree.

```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

to

```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

**Trivia:**
This problem was inspired by [this original tweet](https://twitter.com/mxcl/status/608682016205344768) by [Max Howell](https://twitter.com/mxcl):

> Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.

*(p.s. from zzl: Something intererting to look at in the original tweet)*



### Solution:

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
    public TreeNode invertTree(TreeNode root) {
        if(root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if(root.left != null) {root.left = invertTree(root.left);}
            if(root.right != null) {root.right = invertTree(root.right);}
            return root;
        }
        return root;//return null
    }
}
```

#### Question:

At first I wrote *invertTree(root.left)* instead of *root.left = invertTree(root.left)*, and it  finally returns the most recent only one child node, I cannot figure out why!

**Update:**It's actually not the case.  Both *invertTree(root.left)* and *root.left = invertTree(root.left)* are OK because of the parameter passing characteristic of JAVA reference type.