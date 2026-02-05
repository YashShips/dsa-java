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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 1;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int size = ((count-1) /2) + 1;
        temp = head;
        for(int i = 1; i < size; i++){
            temp = temp.next;
        }

        return temp;
    }
}