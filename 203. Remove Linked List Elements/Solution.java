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
