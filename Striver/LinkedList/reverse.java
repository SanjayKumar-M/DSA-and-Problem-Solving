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
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode revNode = reverseList(head.next);
    
    // Reverse the pointers
    head.next.next = head; // Make the next node of the next node point back to the current node
    head.next = null; // Make the current node point to null
    
    // Return the head of the reversed list
    return revNode;
       
    //    ListNode previous = null;
    //    ListNode current = head;
    //    ListNode nextNode = head.next;
    //    while(nextNode != null){
    //        current.next = previous;
    //        previous = current;
    //        current = nextNode;
    //        nextNode = nextNode.next;
    //    }
    //    current.next = previous;
       
    //    return current;
        
    }
}