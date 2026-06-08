package BinarySearchTree.BinaryTreePostOrder;

public class Main {
    public static void main(String[] args) {
        int[] postorder={4,7,5,12,20,15,11,10};
        BinaryTreeCreationPostOrder tree=new BinaryTreeCreationPostOrder();
        BinaryTreeCreationPostOrder tree1=new BinaryTreeCreationPostOrder();
        int[] ind={postorder.length-1};
        tree.root=tree.treeConstructionUsingRecurssion(postorder,ind,Integer.MIN_VALUE);
        tree.inOrdertraversal(tree.root);
        tree1.root=tree1.treeConstructionIteratively(postorder);
        System.out.println();
        tree1.inOrdertraversal(tree1.root);
    }
}
