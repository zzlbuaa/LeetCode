# 53. Maximum Subarray

## Description

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

**Example:**

```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

**Follow up:**

If you have figured out the O(*n*) solution, try coding another solution using the divide and conquer approach, which is more subtle.

## Solution (Basic DP)

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int[] f = new int[nums.length];
        int res=nums[0];
        for(int j=0; j<nums.length; j++) {
            f[j] = nums[j];
            //转移方程：f[j] = max(nums[j],nums[j]+f[j-1])
            if(j>0 && f[j-1]+nums[j]>f[j]) {
                f[j] = f[j-1] + nums[j];
            }
            res = Math.max(res,f[j]);
        }
        return res;        
    }  
}
```

