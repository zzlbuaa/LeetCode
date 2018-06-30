# 152. Maximum Product Subarray

## Description

Given an integer array `nums`, find the contiguous subarray within an array (containing at least one number) which has the largest product.

**Example 1:**

```
Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```

**Example 2:**

```
Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
```

## Solution

```java
class Solution {
    public int max(int a, int b) {
        if(a>b) {
            return a;
        }
        return b;
    }
    
    public int min(int a, int b) {
        if(a<b) {
            return a;
        }
        return b;
    }
    
    public int maxProduct(int[] nums) {
        int[] f = new int[nums.length];
        int[] g = new int[nums.length];
        int res = nums[0];
        
        for(int j=0; j<nums.length; j++) {
            f[j] = nums[j];
            g[j] = nums[j];
            if(j>0) {
                f[j] = max(f[j],nums[j]*f[j-1]);
                f[j] = max(f[j],nums[j]*g[j-1]);
                g[j] = min(g[j],nums[j]*f[j-1]);
                g[j] = min(g[j],nums[j]*g[j-1]);
            }
            if(f[j]>res) {
                res = f[j];
            }
        }
        return res;
    }
}
```

The most basic dynamic programming solution, but it is very slow.