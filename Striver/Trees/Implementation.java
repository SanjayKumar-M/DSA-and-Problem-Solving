package Striver.Trees;

//constructing a binary search tree
class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

}


public class Implementation {
    BST rootNode;

    public Implementation() {
        this.rootNode = null;
    }

    private BST InsertViaRecursion(BST root, int data) {
        if (root == null) {
            return new BST(data);
        }
        if (data >= root.data) {
            root.right = InsertViaRecursion(root.right, data);
        } else {
            root.left = InsertViaRecursion(root.left, data);
        }
        return root;
    }

    public void Insert(int data) {
        rootNode = InsertViaRecursion(rootNode, data);
    }

    private int  FindViaRecursion(BST root, int data){
        if(root == null) return -1;
        if(root.data == data) return root.data;
        else{
            if(data >= root.data){
                return FindViaRecursion(root.right, data);
            }
            return FindViaRecursion(root.left, data)

        }
    }

    public boolean Find(int data) {
        int result = FindViaRecursion(rootNode, data);
        if (result == -1) {
            return false;
        }
        return true;

    }

    private void PreOrderTraversal(BST root) {
        // root -> left -> right
        System.out.println(root.data);
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public void PreOrder() {
        PreOrderTraversal(rootNode);
    }

    private void InOrderTraversal(BST root) {
        // left -> root -> right
        if (root == null)
            return;
        InOrderTraversal(root.left);
        System.out.println(root.data);
        InOrderTraversal(root.right);

    }
    public void InOrder(){
        InOrderTraversal(rootNode);
    }

    private void PostOrderTraversal(BST root) {
        // left -> right-> root
        if (root == null)
            return;
        PostOrderTraversal(root.left);
       
        PostOrderTraversal(root.right);
        System.out.println(root.data);

    }
    public void PostOrder(){
        PostOrderTraversal(rootNode);
    }


    public int DepthOfTree(BST root, int depth, int data){
        if(root == null ) return -1;
        if(root.data == data) return depth;

        if(data >= root.data) return DepthOfTree(root.right, depth+1, data);
        return DepthOfTree(root.left, depth+1, data);

    }

    public int  Depth(int data){
        return DepthOfTree(rootNode, 0, data);
    }

    
    public void InsertViaLoop(int data) {
        BST newNode = new BST(data);
        if (rootNode == null) {
            rootNode = newNode;
        }
        BST current = rootNode;

        while (true) {

            if (newNode.data >= current.data) {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;

            } else {
                if (current.left == null) {
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
        System.out.println(tree.rootNode.left);
        tree.PreOrder();

    }

}
