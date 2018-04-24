# 24. Swap Nodes in Pairs

### Description

Given a linked list, swap every two adjacent nodes and return its head.

**Example:**

```
Given 1->2->3->4, you should return the list as 2->1->4->3.
```

**Note:**

- Your algorithm should use only constant extra space.
- You may **not** modify the values in the list's nodes, only nodes itself may be changed.



### Iterative Solution

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
    public ListNode swapPairs(ListNode head) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode p = sentinel.next;
        int num = 0;
        while (p != null && p.next != null) {
            prev.next = p.next;
            p.next = p.next.next;
            prev.next.next = p;
            prev = p;
            p = p.next;
        }
        return sentinel.next;
    }
}
```

每次交换相邻两个ListNode，p指向第一个，p.next指向第二个，prev.next指向p，循环条件即为*p != null && p.next != null*，这样可避免nullpointer



Try recursive method!!!
注意linked list题中while循环判断的边界条件，在脑子里想清楚！