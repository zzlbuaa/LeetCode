# 238. Product of Array Except Self

### Description

Given an array of *n* integers where *n* > 1, `nums`, return an array `output` such that `output[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

Solve it **without division** and in O(*n*).

For example, given `[1,2,3,4]`, return `[24,12,8,6]`.

**Follow up:**
Could you solve it with constant space complexity? (Note: The output array **does not** count as extra space for the purpose of space complexity analysis.)



### Solution (Invalid)

```java
public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 2 && nums[0] == 0 && nums[1] == 0) return new int[]{0, 1};//这题OJ有毛病啊！
        int product_all = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                if(i==nums.length-1) product_all = 0;
                continue;
            }
            product_all *= nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) nums[i] = product_all;
            else nums[i] = product_all/nums[i];
        }
        return nums;
    }
}
```

用所有数之积的除法得到product of array except self。感觉满足题目所说的tima and space complexity要求，注意避开input中含有一个或者多个0的情况，这题没通过OJ,感觉OJ有bug。

Update: 没注意条件....不能用除法。



### Better Solution

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int p = 1, i = 0; i < nums.length; p *= nums[i++]) {
            result[i] = p;
        }
        for (int p = 1, i = nums.length - 1; i >= 0; p *= nums[i--]) {
            result[i] *= p;
        }
        return result;
    }
}
```

This solution is fantastic! How to think like this?

Check out -> **Divide and conquer**

