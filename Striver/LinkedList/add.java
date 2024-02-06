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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // creating instance of l1 and l2 
        ListNode list1 = l1;
        ListNode list2 = l2;

        // creating dummypointer to track resultnode (dummy.next = resNode)
        ListNode dummyNode = new ListNode(-1);

        // creating current for traversing
        ListNode current = dummyNode;

        // carry is the no we get after addition (5+5 = 10) heare 1 is carry
        int carry = 0;

        // iterate 2 lists till both are not empty
        while(list1 != null || list2 != null){

            // creating temp sum to calculate the sum of 2 nodes
            int sum = carry;
            if(list1 !=null){
                // summing current sum and current node value
                sum = sum+list1.val;
                list1 = list1.next;
            }
            if(list2 !=null){
                // summing current sum and current node value
                sum = sum+list2.val;
                list2 = list2.next;
            }

            //again creating new node to store result node (5+5 = 10) here 0 is stored 
            ListNode resultNode = new ListNode(sum%10);
            // calculating carry (5 +5  = 10) here carry is 1
             carry = sum/10;
            
            // assigning result node to current dummynode
            current.next = resultNode;

            // incrementing for traversing
            current = current.next;
        }

        // if still there is a carry after addition place that no at the end !
        if(carry >0){
            ListNode carryNode = new ListNode(carry);
            current.next = carryNode;
        }
        // simply returning the nodes!
        return dummyNode.next;
        
    }
}