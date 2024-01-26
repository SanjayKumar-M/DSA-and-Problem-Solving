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
        public LinkedList(){
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
                tail = newNode;
            }
        }
        public void AtBeginning(int data){
            Node startingNode = new Node(data);
            if(head == null && tail == null){
                head = tail = startingNode;
            }
            else{
                startingNode.next = head;
                head = startingNode;
            }
        }
        public void reverse(){
            // 1->2->3->4->null  = 1-head, 4-tail,
            // so 3 pointers will be there previous = null,current=current.next,next = next.next

            Node previous = null;
            Node current = head;
            Node next = head.next;
            while(next != null){
                current.next = previous;
                previous = current;
                current = next;
                next = next.next;
            }
            current.next = previous;

            head = current;

        }
        
        public String Output(){
            StringBuilder result = new StringBuilder();
            Node currentNode = head;
            while(currentNode != null){
                result.append(currentNode.data);
                if(currentNode.next == null){
                    result.append(" --> END");
                }
                else{
                    result.append(" --> ");
                }

                currentNode = currentNode.next;

            } 
            return result.toString();
        }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Insert(1);
        ll.Insert(2);
        ll.Insert(3);
        ll.Insert(4);
        ll.AtBeginning(10);
        ll.reverse();
        // ll.insertNodeAtSpecificPlace(20, 1);
        System.out.println(ll.Output());
    }
}