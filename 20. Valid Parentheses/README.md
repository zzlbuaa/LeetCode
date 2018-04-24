# 20. Valid Parentheses

## Description

Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

**Example 1:**

```
Input: "()"
Output: true
```

**Example 2:**

```
Input: "()[]{}"
Output: true
```

**Example 3:**

```
Input: "(]"
Output: false
```

**Example 4:**

```
Input: "([)]"
Output: false
```

**Example 5:**

```
Input: "{[]}"
Output: true
```



## Solution

```java
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++) {
        if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') { stack.push(s.charAt(i));}
        else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') { stack.pop();}
        else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') { stack.pop();}
        else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') { stack.pop();}
        else { return false;}
        }
        return stack.empty();
    }
}
```

## Note:

* Switch-case is much faster and you should try
* *stack.peek()*
* *stack.empty()* is pretty much the same as *stack.isEmpty()*
* Go and check the implementation of stack in java
* Remember to write *else-if* instead of only *if*, think about the wierd bug.