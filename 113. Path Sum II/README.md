# 113. Path Sum II

### Description

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

**Note:** A leaf is a node with no children.

**Example:**

Given the below binary tree and `sum = 22`,

```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
```

Return:

```
[
   [5,4,11,2],
   [5,8,4,5]
]
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
```

Typical DFS & recursion solution. ***But there is something special to notice about this specific question:***

What's different about this question is that, the *List<List<Integer>>* **res** we use to store the results cannot automatically keep what it is within each time of recursion, so we have to manually remove the newest element in this **res** list to keep things in order.