# 216. Combination Sum III

### Description

Find all possible combinations of **\*k*** numbers that add up to a number **\*n***, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

**Note:**

- All numbers will be positive integers.
- The solution set must not contain duplicate combinations.

**Example 1:**

```
Input: k = 3, n = 7
Output: [[1,2,4]]
```

**Example 2:**

```
Input: k = 3, n = 9
Output: [[1,2,6], [1,3,5], [2,3,4]]
```



### Solution

```java
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int k, int n, int start) {
        if(n == 0 && k == 0) res.add(new ArrayList(tempList));
        else if(n < 0) return;
        else {
            for(int i=start; i<=9; i++) {
                tempList.add(i);
                backtrack(res, tempList, k-1, n-i, i+1);//Made a mistake here
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
```

You should think about what current backtracking state is and what should be the next state.

At first I made mistake in:

```java
backtrack(res, tempList, k-1, n-i, start+1);
```

This will lead to results like *[[1,2,4],[2,3,3],[3,3,2]]*. That's because every time it iterates from the last start rather than last state *i*. So the correct code should be:

```java
backtrack(res, tempList, k-1, n-i, i+1);
```

