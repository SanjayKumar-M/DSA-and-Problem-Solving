
class ownStack{
   private int size;
   private int[] values;
   private int top = 0;

   public ownStack(int size){
    this.size = size;
    this.top = 0;
    this.values = new int[size];
   }

   public void Push(int value){
    if(top > size){
        System.out.println("Stack limit reached!");
    }
    
    else{
        this.values[top] = value;
        this.top++;
    }
   }

   public String Output(){
    StringBuilder result = new StringBuilder();
    for(int i = size-1;i>=0;i--){
        result.append(values[i]).append("\n");
    }
    return result.toString();
   }
}

public class Implementation {

    public static void main(String[] args) {
        ownStack stack = new ownStack(5);
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(40);
        stack.Push(50);
        System.out.println(stack.Output());
    }
    
}
