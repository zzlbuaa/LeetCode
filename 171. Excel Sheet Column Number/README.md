# 171. Excel Sheet Column Number

#### Description:

Related to question [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/)

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

```
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
```



#### My Solution:

```java
class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int result = 0;
        int base_val = 'A' - 1;
        for (int i=0; i<len; i++) {
            int char_val = s.charAt(len-1-i) - base_val;
            result += char_val * Math.pow(26,i);
        }
        return result;
    }
}
```

**Analysis:** Loop from the back of the string, and use ***Math.pow()*** for transition.



#### Seemingly Wiser Solution:

The loop can be written from the front as:

```java
for(int i = 0 ; i < s.length(); i++) {
      result = result * 26 + (s.charAt(i) - 'A' + 1);
}
```

This is similar to **'how to calculate binary or decimal or any given number scale'**



#### TODO:

* How this '2ms solution' come? I tried but it does not work, it's still 5ms. [2ms solution](https://leetcode.com/problems/excel-sheet-column-number/discuss/52124/My-2ms-JAVA-solution)

  ​

