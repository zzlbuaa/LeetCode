# 66. Plus One

### Description

Given a **non-empty** array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

**Example 1:**

```
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
```

**Example 2:**

```
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
```



### Solution

```java
class Solution {
    public int[] plusOne(int[] digits) {
        int add = 1;
        int resizing_flag = 0;
        for(int i=digits.length-1; i>=0; i--) {
            digits[i] += add;
            if (digits[i] == 10) {
                digits[i] = 0;
                add = 1;
                if (i == 0) { resizing_flag = 1;}
            }
            else {
                add = 0;
                break;
            }
        }
        if (resizing_flag == 1) {
            int[] newDigits = new int[digits.length+1];
            for(int i=digits.length-1; i>0; i--) {
                newDigits[i+1] = digits[i];
            }
            newDigits[1] = 0;
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
```

还是理清楚逻辑。因为这个integer是用array来存储每一位，如果一直进位到最高位的话就需要resize这个array。所以有一个表示进位的标志位*add_flag*和一个表示进位到最高位的标志位*resizing_flag*。有了这两个标志位以后就很简单了。



× 如果用arraycopy做resizing的话会比resizing快吗？可以试一下。