# 58. Length of Last Word

### Description:

Given a string *s* consists of upper/lower-case alphabets and empty space characters `' '`, return the length of last word in the string.

If the last word does not exist, return 0.

**Note:** A word is defined as a character sequence consists of non-space characters only.

**Example:**

```
Input: "Hello World"
Output: 5
```



### Solution:

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int lastLen=0;
        int spaceNum = 0;
        if (s.length() == 0) {return 0;}
        int index = s.length()-1;
        while (index >= 0 && s.charAt(index) == ' ') {
            spaceNum++;
            lastLen++;
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            lastLen++;
            index--;
        }
        return lastLen - spaceNum;
    }
}
```

**Analysis:** Pay attention to special test cases, " ", "a" and "hello ". The two while loops can respectively get the length of *"spaceNum"* and *"lastLen"*. 



**`Attention`:** In the while loop, *index >= 0* should come before *s.charAt(index) == ' '*, otherwise there will be **out of bound exception**!!!!!



### TODO:

* Methods using ***trim()***