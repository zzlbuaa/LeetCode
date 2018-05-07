# 46. Permutations

### Description

Given a collection of **distinct** integers, return all possible permutations.

**Example:**

```
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```



### Solution 1: Recursive rotation, and slow

```java
class Solution {
    public List<List<Integer>> results = new ArrayList<>();
    public int size;
    
    public List<List<Integer>> permute(int[] nums) {
        size = nums.length;
        permute(nums, 0);
        return results;
    }
    
    public void permute(int[] nums, int start) {
        if(start == size-1) {
            rotate(nums, start);
            results.add(Arrays.stream( nums ).boxed().collect(Collectors.toList()));
            //rotate(nums, start);
        }
        for(int i=0; i<size-start; i++) {
            rotate(nums, start);
            permute(nums, start+1);
        }
    }
    
    public void rotate(int[] nums, int start) {
        int tmp = nums[size-1];
        for(int i=size-1; i>start; i--) {
            nums[i] = nums[i-1];
        }
        nums[start] = tmp;
    }
}
```

Similar solution to the book *Data Structure and Algorithm in Java*, recursively rotate the right n, n-1, n-2, ... , 2 items. Since in each time of the rotation, arraycopy is needed, and makes this solution **too slow**. *O(n! × n/2)* ?



### Solution 2: Backtracking

```java
class Solution {
    public List<List<Integer>> results = new ArrayList<>();
    public boolean[] used;
    public List<Integer> solution = new ArrayList<>();
    public int size;
    public int[] candidates;
    
    public List<List<Integer>> permute(int[] nums) {
        candidates = nums;
        size = nums.length;
        used = new boolean[size];
        backtrack(0);
        return results;
    }
    
    public void backtrack(int n) {
        if (n == size) {
            results.add(new ArrayList(solution));
            return;
        }
        for(int i=0; i<size; i++) {
            if (!used[i]) {
                used[i] = true;
                solution.add(candidates[i]);
                backtrack(n+1);
                used[i] = false;
                solution.remove(solution.size()-1);
            }
        }
    }

}
```



[Backtracking](http://www.csie.ntnu.edu.tw/~u91029/Backtracking.html): This site provides a good intro to backtracking. Take your time and have a check.

Backtracking is an effective and universal way of searching all possible solutions. **Keep in mind this basic and typical backtracking solution!**

* The key is to have a ***boolean[] used*** to keep track of solutions.
* Remember to use

```java
 results.add(new ArrayList(solution));
```

instead of 

```java
 results.add(solution);
```

Or you will end up with all empty lists in the result.