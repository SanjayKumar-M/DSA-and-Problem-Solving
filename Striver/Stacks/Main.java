class ownStack {
    private int size;
    private int[] values;
    private int top = -1;

    public ownStack(int size) {
        this.size = size;
        this.values = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack overflow!");
        } else {
            values[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            return values[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return values[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }

    public String output() {
        StringBuilder result = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            result.append(values[i]).append("\n");
        }
        return result.toString();
    }
}

public class Main{
    public static void main(String[] args) {
        ownStack stack = new ownStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.output());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}