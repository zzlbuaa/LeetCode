# 257. Binary Tree Paths

### Description

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

```
   1
 /   \
2     3
 \
  5
```

All root-to-leaf paths are:

```
["1->2->5", "1->3"]
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
```

Attention: **String** type is immutable. And according to that, when we recursively call **helper** method, the **String** cur is passed by value, so it will remain unchanged in its hierachy automatically. Unlike in [113. Path Sum II]() we need to manually remove the newest result in each recursion.

Rememer to think about what **cur** is in each recursion and manually add the last **node.val** in the end of recursion.

Similar questions: [113. Path Sum II](https://github.com/zzlbuaa/LeetCode/tree/master/113.%20Path%20Sum%20II) [129. Sum Root to Leaf Numbers](https://github.com/zzlbuaa/LeetCode/tree/master/129.%20Sum%20Root%20to%20Leaf%20Numbers)  [257. Binary Tree Paths](https://github.com/zzlbuaa/LeetCode/tree/master/257.%20Binary%20Tree%20Paths) [22. Generate Parentheses](https://github.com/zzlbuaa/LeetCode/tree/master/22.%20Generate%20Parentheses)