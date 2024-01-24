// head[10] ->20 ->30 ->40(tail) ->NULL
package Striver.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}

public class Pract {
   
    
   Node head;
   Node tail;
   public Pract(){
    this.head = null;
    this.tail =null;
   }

   public void Insert(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
    }
    else{
        tail.next = newNode;
        tail = newNode;

        // Node currentNode = head;
        // while(currentNode.next != null){
        //     currentNode = currentNode.next;

        // }
        // currentNode.next = newNode;
    }
   }
   public int count(){
    Node current = head;
        int count = 0;
        while(current != null){
           count = count+current.data;
        }
        return count;

   }

   public void beginning(int value){
    Node firstNode = new Node(value);
    if(head == null){
        head = firstNode;
        tail = firstNode;
    }
    else{
        firstNode.next = head;
        head = firstNode;
    }
   }

   public void insertNodeAtSpecificPlace(int value, int place) {
    Node specificNode = new Node(value);

    if (head == null && tail == null) {
        head = tail = specificNode;
    } else {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == place) {
                specificNode.next = currentNode.next;
                currentNode.next = specificNode;
                break; // Break out of the loop once the insertion is done
            }
            currentNode = currentNode.next;
        }
    }
}


    public String printLinkedList(){
        Node current = head;
        StringBuilder Output = new StringBuilder();
            while(current != null){
            Output.append(current.data);
            if(current.next == null){
                Output.append(" --> END");
            }
            else{
                Output.append(" --> ");
            }
            current = current.next;
        }
       return Output.toString();
        
    }
    public static void main(String[] args) {
        Pract ll = new Pract();
       ll.Insert(1);
       ll.Insert(2);
       ll.Insert(3);
       ll.Insert(4);
       ll.Insert(5);
       ll.beginning(10);
       ll.insertNodeAtSpecificPlace(200, 3);
        
        System.out.println(ll.printLinkedList());
        
    }
  
}
