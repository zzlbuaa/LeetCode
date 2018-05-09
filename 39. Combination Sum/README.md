# 39. Combination Sum

### Description

Given a **set** of candidate numbers (`candidates`) **(without duplicates)** and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sums to `target`.

The **same** repeated number may be chosen from `candidates` unlimited number of times.

**Note:**

- All numbers (including `target`) will be positive integers.
- The solution set must not contain duplicate combinations.

**Example 1:**

```
Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
```

**Example 2:**

```
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
```



### Solution

```java
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), 0, candidates, target, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> tmpList, int sum, int[] candidates, int target, int start) {
        if(sum == target) {
            res.add(new ArrayList(tmpList));
        }
        if(sum > target) {
            return;
        }
        else {
            for (int i=start; i<candidates.length; i++) {
                tmpList.add(candidates[i]);
                sum += candidates[i];
                backtracking(res, tmpList, sum, candidates, target, i);
                sum -= candidates[i];
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
```

Typical backtracking solution. 

Notice that *sum* needs a *'-='* too to keep it right in the backtracking process. And the backtracking function should start from last call's *start*, or it will do from the beginning like start from 1,2,3,4,... every time, then you will get duplicated solutions like [[2,2,3],[2,3,2],[3,2,2]].



### TODO

Note that in this setting, all candidates are positive integers. What if we have non-positive integers?