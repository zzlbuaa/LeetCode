# 203. Remove Linked List Elements

## Description

Remove all elements from a linked list of integers that have value **val**.

**Example**
**\*Given:*** 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6,  **val** = 6
**\*Return:*** 1 --> 2 --> 3 --> 4 --> 5

## Solution

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode p = sentinel.next;
        ListNode prev = sentinel;
        while (p != null) {
            if(p.val == val) {
                p = p.next;
                prev.next = p;
            }
            else {
                prev = prev.next;
                p = p.next;
            }
        }
        return sentinel.next;
    }
}
```

**Analysis:** 

链表中，要删除一个节点，必须保留该节点前一节点的引用。一定注意if-else条件判断，切记避免nullpointerexception.

