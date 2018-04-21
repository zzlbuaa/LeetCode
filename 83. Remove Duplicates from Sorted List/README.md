# 83. Remove Duplicates from Sorted List

### Description:

Given a sorted linked list, delete all duplicates such that each element appear only *once*.

**Example 1:**

```
Input: 1->1->2
Output: 1->2
```

**Example 2:**

```
Input: 1->1->2->3->3
Output: 1->2->3
```

### Solution:

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (p != null) {
            while (p.next != null) {
                if (p.val == p.next.val) {
                    p.next = p.next.next;
                }
                //注意这个else，第一次做的时候忘了
                //要是没有的话,p直接变成了p.next.next，就可能是null，从而nullpointerexception
                else{
                p = p.next;
                }
            }
            return head;
        }
        else {
            return null;
        }
    }
}
```

**Attention:** 

* Whenever you need to use a reference type here, be sure to check it is not ***null*** using *if-else*.
* 注意注释中那个else的逻辑，不要漏了

### TODO:

* Implement a recursive method.