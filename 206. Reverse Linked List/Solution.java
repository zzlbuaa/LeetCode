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
