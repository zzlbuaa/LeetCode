# 77. Combinations

### Description

Given two integers *n* and *k*, return all possible combinations of *k* numbers out of 1 ... *n*.

**Example:**

```
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```



### Solution

```java
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), 1, n, k);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> tmpList, int start, int n, int k) {
        if (tmpList.size() == k) {
            res.add(new ArrayList(tmpList));
        }
        else {
            for(int i=start; i<=n; i++) {
                tmpList.add(i);
                backtracking(res, tmpList, i+1, n, k);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
```

Typical backtracking solution here.