# 40. Combination Sum II

### Description

Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sums to `target`.

Each number in `candidates` may only be used **once** in the combination.

**Note:**

- All numbers (including `target`) will be positive integers.
- The solution set must not contain duplicate combinations.

**Example 1:**

```
Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
```

**Example 2:**

```
Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
```



### Solution

```java
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
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
                if(i>start && candidates[i] == candidates[i-1]) continue;
                tmpList.add(candidates[i]);
                sum += candidates[i];
                backtracking(res, tmpList, sum, candidates, target, i+1);
                sum -= candidates[i];
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
```

Three differences from [39. Combination Sum](https://leetcode.com/problems/combination-sum/description/):

1. Backtracking should start from next position rather than the original position.
2. Candidates need to be sorted first in avoid of duplicated reordered results like *[[1,2,5], [2,1,5], [5,1,2]]*.

```java
Arrays.sort(candidates);
```

3. Avoid duplicates.

```java
if(i>start && candidates[i] == candidates[i-1]) continue;
```
