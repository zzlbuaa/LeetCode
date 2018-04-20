# 136. Single Number

### Description:

Given an array of integers, every element appears *twice* except for one. Find that single one.

**Note:**
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

### Solution:

```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int pos=0; pos<nums.length; pos++) {
            result ^= nums[pos];
        }
        return result;
    }
}
```

Bit manipulation: XOR is commutative. O(n) runtime complexity.

# Todo

* A summary on bit manipulation.

