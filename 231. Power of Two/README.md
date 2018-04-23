# 231. Power of Two

## Description

Given an integer, write a function to determine if it is a power of two.



## Solution

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {return false;}
        return (((n - 1) & n) == 0);
    }
}
```

#### Analysis:

If an integer is power of two, it must be like 1, 10, 100, 1000, etc., in binary form. So we have *(n - 1) & n == 0*.

Be sure to try to look at the bits when faced with some mathmatical problems like this!



## TODO:

* What other thoughts we can get from this question?