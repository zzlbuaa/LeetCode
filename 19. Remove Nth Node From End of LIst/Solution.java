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
