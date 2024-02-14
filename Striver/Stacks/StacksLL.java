class LinkedListStack{
    int data;
    LinkedListStack next;
   public LinkedListStack(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class StacksLL {
    LinkedListStack top;
    public StacksLL(){
        this.top = null;
    }

    public void push(int data){
        LinkedListStack newData = new LinkedListStack(data);
       newData.next = top;
       top = newData;

    }
    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
        }
      
            int value = top.data;
            top = top.next;
            return value;
        
    }

    public int peek(){
        return top.data;
    }

    public static void main(String[] args) {
       StacksLL stack = new StacksLL();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
       
    }
    
}
