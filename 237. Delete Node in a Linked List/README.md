# 237. Delete Node in a Linked List

#### Description:

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is `1 -> 2 -> 3 -> 4` and you are given the third node with value `3`, the linked list should become `1 -> 2 -> 4` after calling your function.

#### Solution:

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
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
```

**Analysis:** This question is only about how linked list works. To delete a node (not the last node), you just need to change the ***value*** and ***next*** to use it as the next node, and because the reference to the original next node is gone, the original next node is deleted by JAVA garbbage collector. 

**Note:** The ***deleteNode()*** for *Linked List* is O(1) while for *Array List* is O(n).



#### TODO:

* Consider ***deleteNode()*** in DList.