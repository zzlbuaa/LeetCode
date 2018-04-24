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
