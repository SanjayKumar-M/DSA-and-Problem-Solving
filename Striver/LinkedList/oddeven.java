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
    public ListNode oddEvenList(ListNode head) {
         if (head == null || head.next == null) {
        // There are fewer than two nodes, no rearrangement needed
        return head;
    }

    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenStart = even; // Remember the start of the even-indexed nodes

    while (even != null && even.next != null) {
        odd.next = even.next; // Connect odd node to the next odd node
        odd = odd.next; // Move to the next odd node

        even.next = odd.next; // Connect even node to the next even node
        even = even.next; // Move to the next even node
    }

    // At this point, odd points to the last odd node, so connect it to the start of even-indexed nodes
    odd.next = evenStart;
    return head;
        
    }
}