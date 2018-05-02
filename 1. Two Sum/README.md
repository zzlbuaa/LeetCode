# 1. Two Sum

### Description

Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have **exactly** one solution, and you may not use the *same* element twice.

**Example:**

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```



### Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int firstPos=0; firstPos<nums.length-1; firstPos++) {
            for (int secondPos=firstPos+1; secondPos<nums.length; secondPos++) {
                int sum = nums[firstPos] + nums[secondPos];
                if (sum == target) {
                    indices[0] = firstPos;
                    indices[1] = secondPos;
                    return indices;
                }
            }
        }
        return indices;
    }
}
```

