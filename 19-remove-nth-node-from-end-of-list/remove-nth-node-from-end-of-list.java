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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        head = remove(head, n);
        head = reverse(head);
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            head = curr.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;
    }
    public ListNode remove(ListNode head, int n){
        if(head == null) return null;
        else if(n == 1) return head.next;
        ListNode curr = head;
        for(int i = 1; i < n - 1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}