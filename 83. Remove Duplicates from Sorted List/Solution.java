/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (p != null) {
            while (p.next != null) {
                if (p.val == p.next.val) {
                    p.next = p.next.next;
                }
                //注意这个else，第一次做的时候忘了
                //要是没有的话,p直接变成了p.next.next，就可能是null，从而nullpointerexception
                else{
                p = p.next;
                }
            }
            return head;
        }
        else {
            return null;
        }
    }
}
