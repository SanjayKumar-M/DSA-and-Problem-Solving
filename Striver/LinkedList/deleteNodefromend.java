public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class deleteNodefromend {
 

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        int index = 0;
        while(index<n){
            first = first.next;
            index++;
        }
        if(first == null){
            return head.next;
        }

        while(first.next != null){
            second = second.next;
            first = first.next;
        }
        ListNode NodeToBeDeleted = second.next;
        second.next = second.next.next;
        return head;
        
    }
}
    

