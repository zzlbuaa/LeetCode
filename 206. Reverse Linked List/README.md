# 206. Reverse Linked List

### Description:

Reverse a singly linked list.

[click to show more hints.](https://leetcode.com/problems/reverse-linked-list/description/#)

Hint:

A linked list can be reversed either iteratively or recursively. Could you implement both?



### Solution:

1. #### Iteration

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
       public ListNode reverseList(ListNode head) {
           if (head != null && head.next != null) {
               ListNode curHead = head;
               ListNode nextHead;
               ListNode preHead = null;
               while (curHead != null) {
                   nextHead = curHead.next;
                   curHead.next = preHead;
                   preHead = curHead;
                   curHead = nextHead;
               }
               return preHead;
           }
           return head;
       }
   }
   ```

   **Analysis:** Basic idea here is that there are always three pointers, which are represented in sequence as prevHead, head, recordNext. Everytime in loop just make head.next points to prevHead, and then move all these three pointers to one next step.

2. #### Recursive



### TODO:

* Recursive method!