package Striver.LinkedList;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;

    }
}

public class LinkedList{

    Node head;
    Node tail;
    LinkedList(){
        this.head = null;
        this.tail = null;

    }
    public void Insert(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail  = newNode;
        }
    }
    public void reverse(){
        Node prev= null;
        Node current = head;
        Node next = head.next;
        while(next != null){
            current.next = prev;
            prev =current;
            current = next;
            next = next.next;

        }
        current.next = prev;
        head = current;
        
    }
    public int  middle(){
        Node slow = head;
        Node fast =head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public void removefromEnd(int index){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(count < index ){
                fast = fast.next;
                count++;

        }
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
    }
    public String Output(){
        StringBuilder print = new StringBuilder();
        Node current = head;
        while(current != null){
            print.append(current.data);
            if(current.next != null){
                print.append(" --> ");
            }
            else{
                print.append(" -->  NULL ");
            }
            current = current.next;
        }
        return print.toString();

    } 

 
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Insert(1);
        ll.Insert(2);
        ll.Insert(3);
        ll.Insert(4);
        ll.removefromEnd(3);
        // ll.reverse();
        
        // ll.removeFirst();
        // ll.removeEnd();

        // ll.insertNodeAtSpecificPlace(20, 1);
        System.out.println(ll.Output());
        System.out.println(ll.middle());
        
    }

}


// Node head;
// Node tail;
// public LinkedList(){
//     this.head = null;
//     this.tail = null;
// }
// //--------------------------------------------------------------------------------------------------------------
// public void Insert(int data){
//     Node newNode = new Node(data);
//     if(head == null && tail == null){
//         head = tail = newNode;
//     }
//     else{
//         tail.next = newNode;
//         tail = newNode;
//     }
// }
// //--------------------------------------------------------------------------------------------------------------
// public void AtBeginning(int data){
//     Node startingNode = new Node(data);
//     if(head == null && tail == null){
//         head = tail = startingNode;
//     }
//     else{
//         startingNode.next = head;
//         head = startingNode;
//     }
// }
// //--------------------------------------------------------------------------------------------------------------
// public void reverse(){
//     // 1->2->3->4->null  = 1-head, 4-tail,
//     // so 3 pointers will be there previous = null,current=current.next,next = next.next

//     Node previous = null;
//     Node current = head;
//     Node next = head.next;
//     while(next != null){
//         current.next = previous;
//         previous = current;
//         current = next;
//         next = next.next;
//     }
//     current.next = previous;

//     head = current;

// }
// //--------------------------------------------------------------------------------------------------------------
// public void removeFirst() {
//    Node temp = head;
//    temp = head.next;
//    head = temp;
// }
// //--------------------------------------------------------------------------------------------------------------
// public void removeEnd(){
//    Node current = head;
//    while(current.next != tail){
//     current = current.next;

//    }
//    current.next = null;
//    tail = current;
    
// }
// //--------------------------------------------------------------------------------------------------------------       
// public void atIndex(int data,int index){
//     Node newNode = new Node(data);
//     Node current = head;
//     Node previous = null;
//     while(index >0 && current != null){  
// // that is for example i = 2 means it will continuew till i = 0 i.e ans achieved
//         previous = current;
//         current = current.next;
        
//         index--;
//     }
//     previous.next = newNode;
//     newNode.next = current;
// }

// //--------------------------------------------------------------------------------------------------------------
// public String Output(){
//     StringBuilder result = new StringBuilder();
//     Node currentNode = head;
//     while(currentNode != null){
//         result.append(currentNode.data);
//         if(currentNode.next == null){
//             result.append(" --> END");
//         }
//         else{
//             result.append(" --> ");
//         }

//         currentNode = currentNode.next;

//     } 
//     return result.toString();
// }