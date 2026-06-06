package BinarySearchTree.BinarytreeFromPreorder;

public class BstFromPreOrder {
    Node root;
    BstFromPreOrder(){
        root=null;
    }

    public Node preorderTreeConstruction(int[] preorder,int[] ind,int up){
        if( ind[0]==preorder.length || preorder[ind[0]]>up){
            return null;
        }
        Node node=new Node(preorder[ind[0]]);
        ind[0]++;
        node.left=preorderTreeConstruction(preorder,ind, node.data);
        node.right=preorderTreeConstruction(preorder,ind,up);
        return node;
    }

    void displayTree(Node node, int level){
        if(node==null){
            return;
        }
        displayTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left,level+1);
    }

}
