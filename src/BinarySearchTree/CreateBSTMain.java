package BinarySearchTree;

public class CreateBSTMain {
    public static void main(String[] args) {
        CreateBst tree=new CreateBst();
        int[] arr={50,40,10,20,60,70,65};
        for(int val:arr){
            tree.root=tree.insert(tree.root,val);
        }
        try {
            tree.displayTree(tree.root, 0);
            tree.inOrdertraversal(tree.root);
            tree.root=tree.insert(tree.root, 5);
            tree.insertUsingIterativeApproach(tree.root, 9);
            System.out.println(tree.search(tree.root, 9));
            System.out.println(tree.search(tree.root, 1000));
            tree.displayTree(tree.root, 0);
            tree.inOrdertraversal(tree.root);
            System.out.println();
            tree.root=tree.deleteNode(tree.root,60);
            tree.displayTree(tree.root,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
