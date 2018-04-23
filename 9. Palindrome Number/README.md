# 9. Palindrome Number

### Description:

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

**Example 1:**

```
Input: 121
Output: true
```

**Example 2:**

```
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**

```
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Follow up:**

Coud you solve it without converting the integer to a string?

------

## Base method (converting to String):

### Solution 1 (So slow! 12%):

```java
class Solution {
    public boolean isPalindrome(int x) {
        String x_str = Integer.toString(x);
        for (int i=0; i<x_str.length()/2+1; i++) {
            if (x_str.charAt(i) != x_str.charAt(x_str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
```

 