# 19. Remove Nth Node From End of List

### Description:

Given a linked list, remove the *n*-th node from the end of list and return its head.

**Example:**

```
Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
```

**Note:**

Given *n* will always be valid.

**Follow up:**

Could you do this in one pass?

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode p = sentinel.next;
        ListNode prev = sentinel;
        if (n<0) {return null;}
        ListNode stat = sentinel;
        int size = 0;
        while(stat.next != null) {
            stat = stat.next;
            size++;
        }
        n = size-n;
        while(p != null) {
            if (n==0) {
                prev.next = p.next;
                break;
            }
            else {
                prev = prev.next;
                p = p.next;
                n--;
            }
        }
        if (n>0) {return null;}
        return sentinel.next;
    }
}
```



### Note:

因为是要remove倒数的第几个，所以统计size和remove用了两次iteration。
下次用one pass写一次。(只有fastNode slowNode这种方法吗？感觉时间上也优势不大，但还是有点优势的，这次速度是61% 16ms，下次比较一下)
另外这次有个bug，就是无脑加了一个*p.next != null* 但由于n==0这个条件的限制，实际不应该加这个条件，写之前一定要想清楚。