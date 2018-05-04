# 283. Move Zeroes

### Description

Given an array `nums`, write a function to move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

For example, given `nums  = [0, 1, 0, 3, 12]`, after calling your function, `nums` should be `[1, 3, 12, 0, 0]`.

**Note**:

1. You must do this **in-place** without making a copy of the array.
2. Minimize the total number of operations.



### Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int len = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                if(i != len) {
                    nums[len] = nums[i];
                    nums[i] = 0;
                }
                len++;
            }
        }
    }
}
```

Simple and straightforward solution. Similar idea to [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array)  and [27. Remove Element](https://leetcode.com/problems/remove-element). Move non-zero element in sequence to the front zero positions.    