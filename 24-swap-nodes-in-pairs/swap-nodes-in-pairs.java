/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void realSwap(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null) return;
        ListNode f = curr,
                 s = curr.next;

                 f.next = s.next;
                 s.next = f;
                 prev.next = s;

                 realSwap(f, f.next);

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        realSwap(prev, head);
        return dummy.next;
    }
}