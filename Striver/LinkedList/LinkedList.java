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
        if(head == null & tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }


    }
    public void AtBeginning(int data){
        Node beginningNode = new Node(data);
        if(head == null && tail == null){
            head = beginningNode;
            tail = beginningNode;
        }
        else{
           beginningNode.next = head;
           head = beginningNode;
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
    
    public String Output(){
        StringBuilder Result = new StringBuilder();
        Node resultNode = head;
        
        while(resultNode != null){
            Result.append(resultNode.data);
            if(resultNode.next == null){
                Result.append(" --> END");
            }
            else{
                Result.append(" --> ");
            }
            resultNode= resultNode.next;
        }
        return Result.toString();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Insert(1);
        ll.Insert(1);
        ll.Insert(1);
        ll.Insert(1);
        ll.AtBeginning(10);
        ll.insertNodeAtSpecificPlace(20, 1);
        System.out.println(ll.Output());
    }
}