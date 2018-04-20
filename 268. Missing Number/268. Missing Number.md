# 268. Missing Number

### Description:

Given an array containing *n* distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.

**Example 1**

```
Input: [3,0,1]
Output: 2
```

**Example 2**

```
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
```

**Note**:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

### Solution:

#### 1.Sum

```java
class Solution {
    public int missingNumber(int[] nums) {
        int curr_sum = 0;
        int org_sum = 0;
        for(int i=0; i<nums.length; i++) {
            curr_sum += nums[i];
        }
        for(int i=0; i<nums.length+1; i++) {
            org_sum += i;
        }
        return org_sum - curr_sum;
    }
}
```

# TODO

More methods (bit manipulation probably). Not the fastest yet.

