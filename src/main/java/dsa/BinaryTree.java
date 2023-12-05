package dsa;

public class BinaryTree {
    BTNode root;

    public void insert(int data){
       root=insertRec(root,data);
    }

    private BTNode insertRec(BTNode root, int data) {
        if(root==null){
            root=new BTNode(data);
        } else if (root.data>data) {
            root.left=insertRec(root.left,data);
        } else if (root.data<data) {
            root.right=insertRec(root.right,data);
        }
        return root;
    }

    //left,root,right
    public void inOrder(){
        System.out.println("InOrder Traversal:");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(BTNode root) {
        if (root!=null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    //root,left,right
    public void preOrder(){
        System.out.println("PreOrder Traversal:");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(BTNode root) {
        if (root!=null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        System.out.println("PostOrder Traversal:");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(BTNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }

    }
}
