# 22. Generate Parentheses

#### Description

Given *n* pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given *n* = 3, a solution set is:

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```

### Solution

```java
class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n==0) return res;
        dfs(0, 0, n, "");
        return res;
    }
    
    public void dfs(int l, int r, int n, String cur) {
        if (l == n && r == n) {
            res.add(cur);
            return;
        }
        if (l < n) dfs(l+1, r, n, cur+"(");
        if (r < l) dfs(l, r+1, n, cur+")");
    }
}
```

**Analysis:**

1. Using depth-first search.
2. The condition for adding a *"("* is current total number of *"("* is less than *n*.
3. The condition for add a *")"* is current total number of *")"* is no more than total number of "(".

**Time comlexity:**

This problem is a typical [Catalan Number](https://en.wikipedia.org/wiki/Catalan_number). Refer to this for compexity.

**Similar questions:** [113. Path Sum II](https://github.com/zzlbuaa/LeetCode/tree/master/113.%20Path%20Sum%20II) [129. Sum Root to Leaf Numbers](https://github.com/zzlbuaa/LeetCode/tree/master/129.%20Sum%20Root%20to%20Leaf%20Numbers)  [257. Binary Tree Paths](https://github.com/zzlbuaa/LeetCode/tree/master/257.%20Binary%20Tree%20Paths) [22. Generate Parentheses](https://github.com/zzlbuaa/LeetCode/tree/master/22.%20Generate%20Parentheses)

### TODO:

Catalan number is also a concept in discrete math, make a summary for that.