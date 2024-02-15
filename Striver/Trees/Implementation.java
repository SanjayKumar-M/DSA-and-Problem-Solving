package Striver.Trees;
 //constructing a binary search tree
class BST{
    int data;
    BST left;
    BST right;
    BST(int data){
        this.data = data;
        this.left = null;
        this.right = null;


    }

}
public class Implementation {
    BST rootNode;

    public Implementation(){
        this.rootNode = null;
    }
    private BST InsertViaRecursion(BST root, int data){
        if(root == null){
            return new BST(data);
        }
        if(data >= root.data){
            root.right = InsertViaRecursion(root.right, data);
        }
        else{
            root.left = InsertViaRecursion(root.left, data);
        }
        return root;
    }

    public void Insert(int data){
        rootNode = InsertViaRecursion(rootNode, data);
    }
    public void InsertViaLoop(int data){
        BST newNode = new BST(data);
        if(rootNode == null){
            rootNode = newNode;
        }
        BST current = rootNode;

        while(true){
         
                if(newNode.data >= current.data){
                    if(current.right == null){
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                    
                    
                }
                else{
                    if(current.left == null){
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                }
            

        }
        
    }
    public static void main(String[] args) {
        Implementation tree = new Implementation();

        tree.Insert(1);
        tree.Insert(2);
        tree.Insert(3);
    }

    
}
