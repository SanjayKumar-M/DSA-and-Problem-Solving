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
        for(int i =1;i<=10;i++){
            ll.Insert(i);
        }
        System.out.println(ll.printLinkedList());
    }
  
}
