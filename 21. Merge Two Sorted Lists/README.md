# 21. Merge Two Sorted Lists

### Description

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

**Example:**

```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```

### Solution

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode cur = sentinel;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur.next.next = null;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
                cur.next.next = null;
            }
            cur = cur.next;
        }
        if(l1 == null && l2 == null) {
            return sentinel.next;
        }
        else if(l1 == null) {
            cur.next = l2;
            return sentinel.next;
        }
        else {
            cur.next = l1;
            return sentinel.next;
        }
    }
}
```

**Analysis:** 

搞清楚逻辑就好。71%，想想能怎么优化。