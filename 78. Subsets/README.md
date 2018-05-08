# 78. Subsets

### Description

Given a set of **distinct** integers, *nums*, return all possible subsets (the power set).

**Note:** The solution set must not contain duplicate subsets.

**Example:**

```
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```



### Solution

```java
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tmpList, int[] nums, int start) {
        res.add(new ArrayList(tmpList));
        for(int i=start; i<nums.length; i++) {
            tmpList.add(nums[i]);
            backtrack(res, tmpList, nums, i+1);
            tmpList.remove(tmpList.size()-1);
        }
    }
}
```

Typical and basic backtracking solution. 

Sequentially add each item in *int[] nums* to the *tmpList*, and add the *tmpList* to *res* every time it changes. Note that a *start* index is needed to avoid duplicated item to be added in tmpList.

```
nums=[1,2,3]
[] backtrack(0)
start=0 i=0 [1] backtrack(1)
start=1 i=1 [1,2] backtrack(2)
start=2 i=2 [1,2,3] backtrack(3) no loop in backtrack(3) 
--------track back---------
start=1 i=2 [1,3] backtrack(3) no loop in backtrack(3)
--------track back---------
start=0 i=1 [2] backtrack(2)
start=2 i=2 [2,3] backtrack(3) no loop in backtrack(3)
--------track back---------
start=0 i=2 [3] backtrack(3) no loop in backtrack(3)

```

 