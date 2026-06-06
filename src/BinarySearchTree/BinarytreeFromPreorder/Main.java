package BinarySearchTree.BinarytreeFromPreorder;

public class Main {
    public static void main(String[] args) {
        int[] preorder={10,5,4,7,11,15,20,18};
        BstFromPreOrder tree=new BstFromPreOrder();
        int[] ind={0};
        tree.root=tree.preorderTreeConstruction(preorder,ind,Integer.MAX_VALUE);
        tree.displayTree(tree.root,0);
    }
}
