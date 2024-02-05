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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode swap = swapPairs(head.next.next);
        ListNode secondNode = head.next;
        secondNode.next = head;
        head.next = swap;

        head =  secondNode;
        return head;
        
    }
}