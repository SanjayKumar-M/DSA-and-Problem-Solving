package Striver.LinkedList;
class Node {
    int value;   // any data type
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;    // creating an empty ll
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Linked List: ");
        linkedList.printList();
    }
}
