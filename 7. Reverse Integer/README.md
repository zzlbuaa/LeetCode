# 7. Reverse Integer

### Description

Given a 32-bit signed integer, reverse digits of an integer.

**Example 1:**

```
Input: 123
Output: 321
```

**Example 2:**

```
Input: -123
Output: -321
```

**Example 3:**

```
Input: 120
Output: 21
```

**Note:**
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.



### Solution

```java
class Solution {
    public int reverse(int x) {
        int abs = Math.abs(x);
        String int_string = Integer.toString(abs);
        int result = 0;
        for(int i=int_string.length()-1; i>=0; i--) {
            int last_result = result;
            result = result * 10 + int_string.charAt(i) - '0';
            if ((result - int_string.charAt(i) + '0') / 10 != last_result) { return 0;} 
        }
        if(result < 0) { return 0;}
        if(x < 0) { return 0-result;}
        else { return result;}
    }
}
```

Pay attention to how to detect overflow!!!

Silly and super slow solution using string. Try another one. 