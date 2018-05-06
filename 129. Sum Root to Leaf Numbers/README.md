# 129. Sum Root to Leaf Numbers

### Description

Given a binary tree containing digits from `0-9` only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path `1->2->3` which represents the number `123`.

Find the total sum of all root-to-leaf numbers.

**Note:** A leaf is a node with no children.

**Example:**

```
Input: [1,2,3]
    1
   / \
  2   3
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
```

**Example 2:**

```
Input: [4,9,0,5,1]
    4
   / \
  9   0
 / \
5   1
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
```



### Solution

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
```

Typical DFS & recursion solution similar to [113. Path Sum II](https://github.com/zzlbuaa/LeetCode/tree/master/113.%20Path%20Sum%20II) [129. Sum Root to Leaf Numbers](https://github.com/zzlbuaa/LeetCode/tree/master/129.%20Sum%20Root%20to%20Leaf%20Numbers)  [257. Binary Tree Paths](https://github.com/zzlbuaa/LeetCode/tree/master/257.%20Binary%20Tree%20Paths) [22. Generate Parentheses](https://github.com/zzlbuaa/LeetCode/tree/master/22.%20Generate%20Parentheses).