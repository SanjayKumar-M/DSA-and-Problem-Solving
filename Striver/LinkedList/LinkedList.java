package Striver.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{

    Node head;
    LinkedList(){
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public String result(){
        Node current = head;
        StringBuilder Result = new StringBuilder();
        while(current != null){
            Result.append(current.data);
            if(current.next != null){
                Result.append(" --> ");
            }
            else{
                Result.append(" --> END ");
            }

            current = current.next;
            

           
        }
        
        return Result.toString();
        
    }

    public static void main(String[] args) {
        
        LinkedList LL = new LinkedList();
        for(int i=1;i<=10;i++){
            LL.insert(i);

        }

       System.out.println(LL.result());
       
    }

}
